package io.realm.internal.objectstore;

import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.UncheckedRow;
import java.io.Closeable;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* JADX INFO: loaded from: classes9.dex */
public class OsObjectBuilder implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Table f79123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f79124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f79125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f79126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final io.realm.internal.g f79127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f79128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static s0<? extends io.realm.n0> f79103g = new k();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static s0<String> f79104h = new v();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static s0<Byte> f79105i = new g0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static s0<Short> f79106j = new m0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static s0<Integer> f79107k = new n0();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static s0<Long> f79108l = new o0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static s0<Boolean> f79109m = new p0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static s0<Float> f79110n = new q0();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static s0<Double> f79111o = new r0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static s0<Date> f79112p = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static s0<byte[]> f79113q = new b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static s0<Object> f79114r = new c();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static s0<Decimal128> f79115s = new d();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static s0<ObjectId> f79116t = new e();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static s0<UUID> f79117u = new f();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static s0<Map.Entry<String, Boolean>> f79118v = new g();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static s0<Map.Entry<String, String>> f79119w = new h();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static s0<Map.Entry<String, Integer>> f79120x = new i();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static s0<Map.Entry<String, Float>> f79121y = new j();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static s0<Map.Entry<String, Long>> f79122z = new l();
    private static s0<Map.Entry<String, Short>> A = new m();
    private static s0<Map.Entry<String, Byte>> B = new n();
    private static s0<Map.Entry<String, Double>> C = new o();
    private static s0<Map.Entry<String, byte[]>> D = new p();
    private static s0<Map.Entry<String, Date>> E = new q();
    private static s0<Map.Entry<String, Decimal128>> F = new r();
    private static s0<Map.Entry<String, ObjectId>> G = new s();
    private static s0<Map.Entry<String, UUID>> H = new t();
    private static s0<Map.Entry<String, io.realm.d0>> I = new u();
    private static s0<io.realm.d0> J = new w();
    private static s0<String> K = new x();
    private static s0<Boolean> L = new y();
    private static s0<Integer> M = new z();
    private static s0<Long> N = new a0();
    private static s0<Short> O = new b0();
    private static s0<Byte> P = new c0();
    private static s0<Float> Q = new d0();
    private static s0<Double> R = new e0();
    private static s0<byte[]> S = new f0();
    private static s0<Date> T = new h0();
    private static s0<Decimal128> U = new i0();
    private static s0<ObjectId> V = new j0();
    private static s0<UUID> W = new k0();
    private static s0<io.realm.d0> X = new l0();

    class a implements s0<Date> {
        a() {
        }
    }

    class a0 implements s0<Long> {
        a0() {
        }
    }

    class b implements s0<byte[]> {
        b() {
        }
    }

    class b0 implements s0<Short> {
        b0() {
        }
    }

    class c implements s0<Object> {
        c() {
        }
    }

    class c0 implements s0<Byte> {
        c0() {
        }
    }

    class d implements s0<Decimal128> {
        d() {
        }
    }

    class d0 implements s0<Float> {
        d0() {
        }
    }

    class e implements s0<ObjectId> {
        e() {
        }
    }

    class e0 implements s0<Double> {
        e0() {
        }
    }

    class f implements s0<UUID> {
        f() {
        }
    }

    class f0 implements s0<byte[]> {
        f0() {
        }
    }

    class g implements s0<Map.Entry<String, Boolean>> {
        g() {
        }
    }

    class g0 implements s0<Byte> {
        g0() {
        }
    }

    class h implements s0<Map.Entry<String, String>> {
        h() {
        }
    }

    class h0 implements s0<Date> {
        h0() {
        }
    }

    class i implements s0<Map.Entry<String, Integer>> {
        i() {
        }
    }

    class i0 implements s0<Decimal128> {
        i0() {
        }
    }

    class j implements s0<Map.Entry<String, Float>> {
        j() {
        }
    }

    class j0 implements s0<ObjectId> {
        j0() {
        }
    }

    class k implements s0<io.realm.n0> {
        k() {
        }
    }

    class k0 implements s0<UUID> {
        k0() {
        }
    }

    class l implements s0<Map.Entry<String, Long>> {
        l() {
        }
    }

    class l0 implements s0<io.realm.d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.realm.internal.m f79129a = new io.realm.e0();

        l0() {
        }
    }

    class m implements s0<Map.Entry<String, Short>> {
        m() {
        }
    }

    class m0 implements s0<Short> {
        m0() {
        }
    }

    class n implements s0<Map.Entry<String, Byte>> {
        n() {
        }
    }

    class n0 implements s0<Integer> {
        n0() {
        }
    }

    class o implements s0<Map.Entry<String, Double>> {
        o() {
        }
    }

    class o0 implements s0<Long> {
        o0() {
        }
    }

    class p implements s0<Map.Entry<String, byte[]>> {
        p() {
        }
    }

    class p0 implements s0<Boolean> {
        p0() {
        }
    }

    class q implements s0<Map.Entry<String, Date>> {
        q() {
        }
    }

    class q0 implements s0<Float> {
        q0() {
        }
    }

    class r implements s0<Map.Entry<String, Decimal128>> {
        r() {
        }
    }

    class r0 implements s0<Double> {
        r0() {
        }
    }

    class s implements s0<Map.Entry<String, ObjectId>> {
        s() {
        }
    }

    private interface s0<T> {
    }

    class t implements s0<Map.Entry<String, UUID>> {
        t() {
        }
    }

    class u implements s0<Map.Entry<String, io.realm.d0>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.realm.internal.m f79130a = new io.realm.e0();

        u() {
        }
    }

    class v implements s0<String> {
        v() {
        }
    }

    class w implements s0<io.realm.d0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final io.realm.internal.m f79131a = new io.realm.e0();

        w() {
        }
    }

    class x implements s0<String> {
        x() {
        }
    }

    class y implements s0<Boolean> {
        y() {
        }
    }

    class z implements s0<Integer> {
        z() {
        }
    }

    public OsObjectBuilder(Table table, Set<io.realm.o> set) {
        OsSharedRealm osSharedRealmP = table.p();
        this.f79124b = osSharedRealmP.getNativePtr();
        this.f79123a = table;
        table.l();
        this.f79126d = table.getNativePtr();
        this.f79125c = nativeCreateBuilder();
        this.f79127e = osSharedRealmP.context;
        this.f79128f = set.contains(io.realm.o.CHECK_SAME_VALUES_BEFORE_SET);
    }

    private static native void nativeAddBinaryDictionaryEntry(long j11, String str, byte[] bArr);

    private static native void nativeAddBoolean(long j11, long j12, boolean z11);

    private static native void nativeAddBooleanDictionaryEntry(long j11, String str, boolean z11);

    private static native void nativeAddBooleanListItem(long j11, boolean z11);

    private static native void nativeAddBooleanSetItem(long j11, boolean z11);

    private static native void nativeAddByteArray(long j11, long j12, byte[] bArr);

    private static native void nativeAddByteArrayListItem(long j11, byte[] bArr);

    private static native void nativeAddByteArraySetItem(long j11, byte[] bArr);

    private static native void nativeAddDate(long j11, long j12, long j13);

    private static native void nativeAddDateDictionaryEntry(long j11, String str, long j12);

    private static native void nativeAddDateListItem(long j11, long j12);

    private static native void nativeAddDateSetItem(long j11, long j12);

    private static native void nativeAddDecimal128(long j11, long j12, long j13, long j14);

    private static native void nativeAddDecimal128DictionaryEntry(long j11, String str, long j12, long j13);

    private static native void nativeAddDecimal128ListItem(long j11, long j12, long j13);

    private static native void nativeAddDecimal128SetItem(long j11, long j12, long j13);

    private static native void nativeAddDouble(long j11, long j12, double d11);

    private static native void nativeAddDoubleDictionaryEntry(long j11, String str, double d11);

    private static native void nativeAddDoubleListItem(long j11, double d11);

    private static native void nativeAddDoubleSetItem(long j11, double d11);

    private static native void nativeAddFloat(long j11, long j12, float f11);

    private static native void nativeAddFloatDictionaryEntry(long j11, String str, float f11);

    private static native void nativeAddFloatListItem(long j11, float f11);

    private static native void nativeAddFloatSetItem(long j11, float f11);

    private static native void nativeAddInteger(long j11, long j12, long j13);

    private static native void nativeAddIntegerDictionaryEntry(long j11, String str, long j12);

    private static native void nativeAddIntegerListItem(long j11, long j12);

    private static native void nativeAddIntegerSetItem(long j11, long j12);

    private static native void nativeAddNull(long j11, long j12);

    private static native void nativeAddNullDictionaryEntry(long j11, String str);

    private static native void nativeAddNullListItem(long j11);

    private static native void nativeAddNullSetItem(long j11);

    private static native void nativeAddObject(long j11, long j12, long j13);

    private static native void nativeAddObjectDictionaryEntry(long j11, String str, long j12);

    private static native void nativeAddObjectId(long j11, long j12, String str);

    private static native void nativeAddObjectIdDictionaryEntry(long j11, String str, String str2);

    private static native void nativeAddObjectIdListItem(long j11, String str);

    private static native void nativeAddObjectIdSetItem(long j11, String str);

    private static native void nativeAddObjectList(long j11, long j12, long[] jArr);

    private static native void nativeAddObjectListItem(long j11, long j12);

    private static native void nativeAddRealmAny(long j11, long j12, long j13);

    public static native void nativeAddRealmAnyDictionaryEntry(long j11, String str, long j12);

    public static native void nativeAddRealmAnyListItem(long j11, long j12);

    private static native void nativeAddString(long j11, long j12, String str);

    private static native void nativeAddStringDictionaryEntry(long j11, String str, String str2);

    private static native void nativeAddStringListItem(long j11, String str);

    private static native void nativeAddStringSetItem(long j11, String str);

    private static native void nativeAddUUID(long j11, long j12, String str);

    private static native void nativeAddUUIDDictionaryEntry(long j11, String str, String str2);

    private static native void nativeAddUUIDListItem(long j11, String str);

    private static native void nativeAddUUIDSetItem(long j11, String str);

    private static native long nativeCreateBuilder();

    private static native long nativeCreateOrUpdateTopLevelObject(long j11, long j12, long j13, boolean z11, boolean z12);

    private static native void nativeDestroyBuilder(long j11);

    private static native long nativeStartDictionary();

    private static native long nativeStartList(long j11);

    private static native long nativeStartSet(long j11);

    private static native void nativeStopDictionary(long j11, long j12, long j13);

    private static native void nativeStopList(long j11, long j12, long j13);

    private static native void nativeStopSet(long j11, long j12, long j13);

    private static native long nativeUpdateEmbeddedObject(long j11, long j12, long j13, long j14, boolean z11);

    public void c(long j11, byte[] bArr) {
        if (bArr == null) {
            nativeAddNull(this.f79125c, j11);
        } else {
            nativeAddByteArray(this.f79125c, j11, bArr);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        nativeDestroyBuilder(this.f79125c);
    }

    public void n(long j11, String str) {
        if (str == null) {
            nativeAddNull(this.f79125c, j11);
        } else {
            nativeAddString(this.f79125c, j11, str);
        }
    }

    public UncheckedRow o() {
        try {
            return new UncheckedRow(this.f79127e, this.f79123a, nativeCreateOrUpdateTopLevelObject(this.f79124b, this.f79126d, this.f79125c, false, false));
        } finally {
            close();
        }
    }

    public void p() {
        try {
            nativeCreateOrUpdateTopLevelObject(this.f79124b, this.f79126d, this.f79125c, true, this.f79128f);
        } finally {
            close();
        }
    }
}
