package com.codrite;

import java.util.Objects;

public class LogData {
    long time;
    String user;
    String resource;

    public LogData(long time, String user, String resource) {
        this.time = time;
        this.user = user;
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "LogData{" +
                "time=" + time +
                ", user='" + user + '\'' +
                ", resource='" + resource + '\'' +
                '}';
    }

    String resource() {
        return this.resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogData logData = (LogData) o;
        return time == logData.time &&
                Objects.equals(user, logData.user) &&
                Objects.equals(resource, logData.resource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, user, resource);
    }
}
