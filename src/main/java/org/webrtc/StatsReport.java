package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public class StatsReport {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public final String f99878id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public static class Value {
        public final String name;
        public final String value;

        @CalledByNative("Value")
        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }

        public String toString() {
            return "[" + this.name + ": " + this.value + "]";
        }
    }

    @CalledByNative
    public StatsReport(String str, String str2, double d11, Value[] valueArr) {
        this.f99878id = str;
        this.type = str2;
        this.timestamp = d11;
        this.values = valueArr;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id: ");
        sb2.append(this.f99878id);
        sb2.append(", type: ");
        sb2.append(this.type);
        sb2.append(", timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(", values: ");
        int i11 = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i11 >= valueArr.length) {
                return sb2.toString();
            }
            sb2.append(valueArr[i11].toString());
            sb2.append(", ");
            i11++;
        }
    }
}
