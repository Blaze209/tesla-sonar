package li;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ii.Error;
import ii.d;
import ii.g;
import ii.k;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import mi.f;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u001b\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0013\u0010\u000e\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\b\b\u0000\u0010\u0011*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lli/a;", "", "<init>", "()V", "Lmi/f;", "", "Lii/o;", "e", "(Lmi/f;)Ljava/util/List;", "b", "(Lmi/f;)Lii/o;", "f", "Lii/o$a;", DateTokenConverter.CONVERTER_KEY, "c", "(Lmi/f;)Lii/o$a;", "Lii/v$a;", "D", "jsonReader", "Lii/v;", "operation", "Lii/k;", "customScalarAdapters", "Lii/g;", "a", "(Lmi/f;Lii/v;Lii/k;)Lii/g;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f90037a = new a();

    /* JADX INFO: renamed from: li.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class C1904a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f90038a;

        static {
            int[] iArr = new int[f.a.values().length];
            try {
                iArr[f.a.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.a.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f90038a = iArr;
        }
    }

    private a() {
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0055  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final Error b(f fVar) {
        fVar.h();
        String str = "";
        List<Error.Location> listD = null;
        List<Object> listF = null;
        Map map = null;
        LinkedHashMap linkedHashMap = null;
        while (fVar.hasNext()) {
            String strL = fVar.L();
            switch (strL.hashCode()) {
                case -1809421292:
                    if (!strL.equals("extensions")) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(strL, mi.a.d(fVar));
                    } else {
                        Object objD = mi.a.d(fVar);
                        map = !(objD instanceof Map) ? null : (Map) objD;
                    }
                    break;
                case -1197189282:
                    if (!strL.equals("locations")) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(strL, mi.a.d(fVar));
                    } else {
                        listD = d(fVar);
                    }
                    break;
                case 3433509:
                    if (!strL.equals("path")) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(strL, mi.a.d(fVar));
                    } else {
                        listF = f(fVar);
                    }
                    break;
                case 954925063:
                    if (!strL.equals("message")) {
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(strL, mi.a.d(fVar));
                    } else {
                        String strO = fVar.O();
                        str = strO != null ? strO : "";
                    }
                    break;
                default:
                    if (linkedHashMap == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    linkedHashMap.put(strL, mi.a.d(fVar));
                    break;
            }
        }
        fVar.j();
        return new Error(str, listD, listF, map, linkedHashMap);
    }

    private final Error.Location c(f fVar) {
        fVar.h();
        int iNextInt = -1;
        int iNextInt2 = -1;
        while (fVar.hasNext()) {
            String strL = fVar.L();
            if (s.f(strL, "line")) {
                iNextInt = fVar.nextInt();
            } else if (s.f(strL, "column")) {
                iNextInt2 = fVar.nextInt();
            } else {
                fVar.F();
            }
        }
        fVar.j();
        return new Error.Location(iNextInt, iNextInt2);
    }

    private final List<Error.Location> d(f fVar) {
        if (fVar.getPeekedToken() == f.a.NULL) {
            return (List) fVar.i1();
        }
        ArrayList arrayList = new ArrayList();
        fVar.f();
        while (fVar.hasNext()) {
            arrayList.add(c(fVar));
        }
        fVar.e();
        return arrayList;
    }

    private final List<Error> e(f fVar) {
        if (fVar.getPeekedToken() == f.a.NULL) {
            fVar.i1();
            return v.m();
        }
        fVar.f();
        ArrayList arrayList = new ArrayList();
        while (fVar.hasNext()) {
            arrayList.add(b(fVar));
        }
        fVar.e();
        return arrayList;
    }

    private final List<Object> f(f fVar) {
        if (fVar.getPeekedToken() == f.a.NULL) {
            return (List) fVar.i1();
        }
        ArrayList arrayList = new ArrayList();
        fVar.f();
        while (fVar.hasNext()) {
            int i11 = C1904a.f90038a[fVar.getPeekedToken().ordinal()];
            if (i11 == 1 || i11 == 2) {
                arrayList.add(Integer.valueOf(fVar.nextInt()));
            } else {
                String strO = fVar.O();
                s.h(strO);
                arrayList.add(strO);
            }
        }
        fVar.e();
        return arrayList;
    }

    public final <D extends ii.v.a> g<D> a(f jsonReader, ii.v<D> operation, k customScalarAdapters) throws Throwable {
        g<D> gVarB;
        s.k(jsonReader, "jsonReader");
        s.k(operation, "operation");
        s.k(customScalarAdapters, "customScalarAdapters");
        Throwable th2 = null;
        try {
            jsonReader.h();
            ii.v.a aVar = null;
            List<Error> listE = null;
            Map<String, ? extends Object> map = null;
            while (jsonReader.hasNext()) {
                String strL = jsonReader.L();
                int iHashCode = strL.hashCode();
                if (iHashCode != -1809421292) {
                    if (iHashCode != -1294635157) {
                        if (iHashCode == 3076010 && strL.equals("data")) {
                            aVar = (ii.v.a) d.b(operation.adapter()).a(jsonReader, customScalarAdapters);
                        } else {
                            jsonReader.F();
                        }
                    } else if (strL.equals("errors")) {
                        listE = f90037a.e(jsonReader);
                    } else {
                        jsonReader.F();
                    }
                } else if (strL.equals("extensions")) {
                    Object objD = mi.a.d(jsonReader);
                    map = objD instanceof Map ? (Map) objD : null;
                } else {
                    jsonReader.F();
                }
            }
            jsonReader.j();
            UUID uuidRandomUUID = UUID.randomUUID();
            s.j(uuidRandomUUID, "randomUUID()");
            gVarB = new g.a(operation, uuidRandomUUID, aVar).c(listE).d(map).b();
        } catch (Throwable th3) {
            th2 = th3;
            gVarB = null;
        }
        try {
            jsonReader.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            } else {
                jn0.g.a(th2, th4);
            }
        }
        if (th2 != null) {
            throw th2;
        }
        s.h(gVarB);
        return gVarB;
    }
}
