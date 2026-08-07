package mi;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.j;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006*\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0006*\u00020\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lokio/j;", "Lmi/f;", "c", "(Lokio/j;)Lmi/f;", "", "", "", "b", "(Ljava/util/Map;)Lmi/f;", DateTokenConverter.CONVERTER_KEY, "(Lmi/f;)Ljava/lang/Object;", "a", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: mi.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class C1968a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92106a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.a.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.a.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.a.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.a.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.a.BEGIN_ARRAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f92106a = iArr;
        }
    }

    private static final Object a(f fVar) {
        try {
            try {
                try {
                    return Integer.valueOf(fVar.nextInt());
                } catch (Exception unused) {
                    return fVar.x1();
                }
            } catch (Exception unused2) {
                return Long.valueOf(fVar.nextLong());
            }
        } catch (Exception unused3) {
            return Double.valueOf(fVar.nextDouble());
        }
    }

    public static final f b(Map<String, ? extends Object> map) {
        s.k(map, "<this>");
        return new h(map, null, 2, null);
    }

    public static final f c(j jVar) {
        s.k(jVar, "<this>");
        return new d(jVar);
    }

    public static final Object d(f fVar) {
        s.k(fVar, "<this>");
        f.a peekedToken = fVar.getPeekedToken();
        switch (C1968a.f92106a[peekedToken.ordinal()]) {
            case 1:
                return fVar.i1();
            case 2:
                return Boolean.valueOf(fVar.nextBoolean());
            case 3:
            case 4:
                return a(fVar);
            case 5:
                return fVar.O();
            case 6:
                fVar.h();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                while (fVar.hasNext()) {
                    linkedHashMap.put(fVar.L(), d(fVar));
                }
                fVar.j();
                return linkedHashMap;
            case 7:
                fVar.f();
                ArrayList arrayList = new ArrayList();
                while (fVar.hasNext()) {
                    arrayList.add(d(fVar));
                }
                fVar.e();
                return arrayList;
            default:
                throw new IllegalStateException(("unknown token " + peekedToken).toString());
        }
    }
}
