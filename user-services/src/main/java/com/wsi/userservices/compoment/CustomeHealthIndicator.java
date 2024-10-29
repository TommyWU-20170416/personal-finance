package com.wsi.userservices.compoment;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class CustomeHealthIndicator implements HealthIndicator {
    //    @Autowired
//    private DataSource dataSource;
    @Override
    public Health health() {
        boolean isDbUp = checkDbStatus();
        return isDbUp ? Health.up().withDetail("Database", "Available").build() : Health.down().withDetail("Database", "Not Available").build();
    }

    private boolean checkDbStatus() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(new Date());
        System.out.println("Checking database status at " + currentTime);
        // 這邊去檢查資料庫連線，需要建立 dataSource bean
//        try (Connection connection = dataSource.getConnection()) {
//            return connection.isValid(1);
//        } catch (Exception e) {
//            return false;
//        }
        return true;
    }
}
