package com.swmansion.reanimated.sensor;

/* JADX INFO: loaded from: classes7.dex */
public enum ReanimatedSensorType {
    ACCELEROMETER(10),
    GYROSCOPE(4),
    GRAVITY(9),
    MAGNETIC_FIELD(2),
    ROTATION_VECTOR(11);

    private final int type;

    ReanimatedSensorType(int i11) {
        this.type = i11;
    }

    public static ReanimatedSensorType getInstanceById(int i11) {
        if (i11 == 1) {
            return ACCELEROMETER;
        }
        if (i11 == 2) {
            return GYROSCOPE;
        }
        if (i11 == 3) {
            return GRAVITY;
        }
        if (i11 == 4) {
            return MAGNETIC_FIELD;
        }
        if (i11 == 5) {
            return ROTATION_VECTOR;
        }
        throw new IllegalArgumentException("[Reanimated] Unknown sensor type.");
    }

    public int getType() {
        return this.type;
    }
}
