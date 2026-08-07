package y6;

import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import u6.d0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ly6/h;", "Lu6/d0;", "Ly6/f;", "<init>", "()V", "", "value", "Lx6/h;", "e", "(Ljava/lang/Object;)Lx6/h;", "", "name", "Ly6/c;", "mutablePreferences", "Ljn0/h0;", "c", "(Ljava/lang/String;Lx6/h;Ly6/c;)V", "Ljava/io/InputStream;", "input", "b", "(Ljava/io/InputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "f", "(Ly6/f;Ljava/io/OutputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "()Ly6/f;", "defaultValue", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h implements d0<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f125160a = new h();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125161a;

        static {
            int[] iArr = new int[x6.h.b.values().length];
            try {
                iArr[x6.h.b.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x6.h.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x6.h.b.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x6.h.b.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x6.h.b.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x6.h.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[x6.h.b.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[x6.h.b.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[x6.h.b.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f125161a = iArr;
        }
    }

    private h() {
    }

    private final void c(String name, x6.h value, c mutablePreferences) throws CorruptionException {
        x6.h.b bVarE0 = value.e0();
        switch (bVarE0 == null ? -1 : a.f125161a[bVarE0.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.i(i.a(name), Boolean.valueOf(value.V()));
                return;
            case 2:
                mutablePreferences.i(i.d(name), Float.valueOf(value.Z()));
                return;
            case 3:
                mutablePreferences.i(i.c(name), Double.valueOf(value.Y()));
                return;
            case 4:
                mutablePreferences.i(i.e(name), Integer.valueOf(value.a0()));
                return;
            case 5:
                mutablePreferences.i(i.f(name), Long.valueOf(value.b0()));
                return;
            case 6:
                f.a<String> aVarG = i.g(name);
                String strC0 = value.c0();
                s.j(strC0, "value.string");
                mutablePreferences.i(aVarG, strC0);
                return;
            case 7:
                f.a<Set<String>> aVarH = i.h(name);
                List<String> listQ = value.d0().Q();
                s.j(listQ, "value.stringSet.stringsList");
                mutablePreferences.i(aVarH, v.r1(listQ));
                return;
            case 8:
                f.a<byte[]> aVarB = i.b(name);
                byte[] bArrQ = value.W().q();
                s.j(bArrQ, "value.bytes.toByteArray()");
                mutablePreferences.i(aVarB, bArrQ);
                return;
            case 9:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final x6.h e(Object value) {
        if (value instanceof Boolean) {
            x6.h hVarBuild = x6.h.f0().r(((Boolean) value).booleanValue()).build();
            s.j(hVarBuild, "newBuilder().setBoolean(value).build()");
            return hVarBuild;
        }
        if (value instanceof Float) {
            x6.h hVarBuild2 = x6.h.f0().u(((Number) value).floatValue()).build();
            s.j(hVarBuild2, "newBuilder().setFloat(value).build()");
            return hVarBuild2;
        }
        if (value instanceof Double) {
            x6.h hVarBuild3 = x6.h.f0().t(((Number) value).doubleValue()).build();
            s.j(hVarBuild3, "newBuilder().setDouble(value).build()");
            return hVarBuild3;
        }
        if (value instanceof Integer) {
            x6.h hVarBuild4 = x6.h.f0().v(((Number) value).intValue()).build();
            s.j(hVarBuild4, "newBuilder().setInteger(value).build()");
            return hVarBuild4;
        }
        if (value instanceof Long) {
            x6.h hVarBuild5 = x6.h.f0().w(((Number) value).longValue()).build();
            s.j(hVarBuild5, "newBuilder().setLong(value).build()");
            return hVarBuild5;
        }
        if (value instanceof String) {
            x6.h hVarBuild6 = x6.h.f0().x((String) value).build();
            s.j(hVarBuild6, "newBuilder().setString(value).build()");
            return hVarBuild6;
        }
        if (value instanceof Set) {
            x6.h.a aVarF0 = x6.h.f0();
            x6.g.a aVarR = x6.g.R();
            s.i(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            x6.h hVarBuild7 = aVarF0.y(aVarR.r((Set) value)).build();
            s.j(hVarBuild7, "newBuilder()\n           …                 .build()");
            return hVarBuild7;
        }
        if (value instanceof byte[]) {
            x6.h hVarBuild8 = x6.h.f0().s(androidx.datastore.preferences.protobuf.g.f((byte[]) value)).build();
            s.j(hVarBuild8, "newBuilder().setBytes(By….copyFrom(value)).build()");
            return hVarBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
    }

    @Override // u6.d0
    public Object b(InputStream inputStream, Continuation<? super f> continuation) throws CorruptionException {
        x6.f fVarA = x6.d.INSTANCE.a(inputStream);
        c cVarB = g.b(new f.b[0]);
        Map<String, x6.h> mapO = fVarA.O();
        s.j(mapO, "preferencesProto.preferencesMap");
        for (Map.Entry<String, x6.h> entry : mapO.entrySet()) {
            String name = entry.getKey();
            x6.h value = entry.getValue();
            h hVar = f125160a;
            s.j(name, "name");
            s.j(value, "value");
            hVar.c(name, value, cVarB);
        }
        return cVarB.d();
    }

    @Override // u6.d0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public f getDefaultValue() {
        return g.a();
    }

    @Override // u6.d0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object a(f fVar, OutputStream outputStream, Continuation<? super h0> continuation) {
        Map<f.a<?>, Object> mapA = fVar.a();
        x6.f.a aVarR = x6.f.R();
        for (Map.Entry<f.a<?>, Object> entry : mapA.entrySet()) {
            aVarR.r(entry.getKey().getName(), e(entry.getValue()));
        }
        aVarR.build().h(outputStream);
        return h0.f84049a;
    }
}
