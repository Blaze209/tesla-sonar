package j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f81981a;
    private static final long serialVersionUID = 8352817235686L;

    public abstract void J(DataOutput dataOutput);

    public abstract String m();

    public abstract j$.time.zone.f s();

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i11 = 0; i11 < 28; i11++) {
            Map.Entry entry = entryArr[i11];
            Object key = entry.getKey();
            Objects.requireNonNull(key);
            Object value = entry.getValue();
            Objects.requireNonNull(value);
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f81981a = Collections.unmodifiableMap(map);
    }

    public static ZoneId systemDefault() {
        return b.d(TimeZone.getDefault());
    }

    public static ZoneId of(String str) {
        return w(str, true);
    }

    public static ZoneId B(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, "offset");
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.getTotalSeconds() != 0) {
            str = str.concat(zoneOffset.f81987c);
        }
        return new t(str, new j$.time.zone.f(zoneOffset));
    }

    public static ZoneId w(String str, boolean z11) {
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith(Marker.ANY_NON_NULL_MARKER) || str.startsWith("-")) {
            return ZoneOffset.P(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            return E(str, 3, z11);
        }
        if (str.startsWith("UT")) {
            return E(str, 2, z11);
        }
        return t.P(str, z11);
    }

    public static ZoneId E(String str, int i11, boolean z11) {
        String strSubstring = str.substring(0, i11);
        if (str.length() == i11) {
            return B(strSubstring, ZoneOffset.UTC);
        }
        if (str.charAt(i11) != '+' && str.charAt(i11) != '-') {
            return t.P(str, z11);
        }
        try {
            ZoneOffset zoneOffsetP = ZoneOffset.P(str.substring(i11));
            if (zoneOffsetP == ZoneOffset.UTC) {
                return B(strSubstring, zoneOffsetP);
            }
            return B(strSubstring, zoneOffsetP);
        } catch (DateTimeException e11) {
            throw new DateTimeException("Invalid ID for offset-based ZoneId: ".concat(str), e11);
        }
    }

    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != t.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return m().equals(((ZoneId) obj).m());
        }
        return false;
    }

    public int hashCode() {
        return m().hashCode();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public String toString() {
        return m();
    }

    private Object writeReplace() {
        return new o((byte) 7, this);
    }
}
