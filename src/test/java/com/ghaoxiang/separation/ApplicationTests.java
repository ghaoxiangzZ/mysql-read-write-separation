package com.ghaoxiang.separation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ApplicationTests {

    private static final ConcurrentHashMap<String, AtomicInteger> COUNT_MAP = new ConcurrentHashMap();

    @Test
    public void testGetDataSource() {
        List<String> slaveDataSourceNames = new ArrayList<>();
        slaveDataSourceNames.add("master0slave0");
        slaveDataSourceNames.add("master0slave1");
        String dataSource;
        for (int i = 0; i < 10; i++) {
            dataSource = getDataSource("ds0", "master0", slaveDataSourceNames);
            System.out.println(dataSource);
            Assert.assertNotNull(dataSource);
        }
    }


    private String getDataSource(String name, String masterDataSourceName, List<String> slaveDataSourceNames) {
        AtomicInteger count = COUNT_MAP.containsKey(name) ? (AtomicInteger) COUNT_MAP.get(name) : new AtomicInteger(0);
        COUNT_MAP.putIfAbsent(name, count);
        count.compareAndSet(slaveDataSourceNames.size(), 0);
        String slaveDataSourceName = slaveDataSourceNames.get(Math.abs(count.getAndIncrement()) % slaveDataSourceNames.size());
        return slaveDataSourceName;
    }
}
