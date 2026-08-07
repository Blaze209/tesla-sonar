package io.realm.internal;

import io.realm.RealmFieldType;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f79070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, a> f79071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f79072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f79073d;

    protected c(int i11) {
        this(i11, true);
    }

    protected final long a(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property propertyC = osObjectSchemaInfo.c(str2);
        a aVar = new a(propertyC);
        this.f79070a.put(str, aVar);
        this.f79071b.put(str2, aVar);
        this.f79072c.put(str, str2);
        return propertyC.c();
    }

    protected abstract void b(c cVar, c cVar2);

    public void c(c cVar) {
        if (!this.f79073d) {
            throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
        }
        if (cVar == null) {
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
        this.f79070a.clear();
        this.f79070a.putAll(cVar.f79070a);
        this.f79071b.clear();
        this.f79071b.putAll(cVar.f79071b);
        this.f79072c.clear();
        this.f79072c.putAll(cVar.f79072c);
        b(cVar, this);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ColumnInfo[");
        sb2.append("mutable=" + this.f79073d);
        sb2.append(",");
        boolean z11 = false;
        if (this.f79070a != null) {
            sb2.append("JavaFieldNames=[");
            boolean z12 = false;
            for (Map.Entry<String, a> entry : this.f79070a.entrySet()) {
                if (z12) {
                    sb2.append(",");
                }
                sb2.append(entry.getKey());
                sb2.append("->");
                sb2.append(entry.getValue());
                z12 = true;
            }
            sb2.append("]");
        }
        if (this.f79071b != null) {
            sb2.append(", InternalFieldNames=[");
            for (Map.Entry<String, a> entry2 : this.f79071b.entrySet()) {
                if (z11) {
                    sb2.append(",");
                }
                sb2.append(entry2.getKey());
                sb2.append("->");
                sb2.append(entry2.getValue());
                z11 = true;
            }
            sb2.append("]");
        }
        sb2.append("]");
        return sb2.toString();
    }

    protected c(c cVar, boolean z11) {
        this(cVar == null ? 0 : cVar.f79070a.size(), z11);
        if (cVar != null) {
            this.f79070a.putAll(cVar.f79070a);
        }
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f79074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final RealmFieldType f79075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f79076c;

        private a(long j11, RealmFieldType realmFieldType, String str) {
            this.f79074a = j11;
            this.f79075b = realmFieldType;
            this.f79076c = str;
        }

        public String toString() {
            return "ColumnDetails[" + this.f79074a + ", " + this.f79075b + ", " + this.f79076c + "]";
        }

        a(Property property) {
            this(property.c(), property.e(), property.d());
        }
    }

    private c(int i11, boolean z11) {
        this.f79070a = new HashMap(i11);
        this.f79071b = new HashMap(i11);
        this.f79072c = new HashMap(i11);
        this.f79073d = z11;
    }
}
