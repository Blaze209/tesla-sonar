package ii;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\u001a)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012\"\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012\"\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020!0\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0012\"\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00160\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010%\"\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00140\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010%\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010%\"\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010%\"\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00110/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00160/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u00101\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00140/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u00101\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\t0/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u00101\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00000/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u00101¨\u0006;"}, d2 = {"", "T", "Lii/b;", "Lii/t;", "b", "(Lii/b;)Lii/t;", "Lii/s;", "a", "(Lii/b;)Lii/s;", "", "buffered", "Lii/u;", "c", "(Lii/b;Z)Lii/u;", "Lii/y;", "e", "(Lii/b;)Lii/y;", "", "Lii/b;", "StringAdapter", "", "IntAdapter", "", "DoubleAdapter", "", DateTokenConverter.CONVERTER_KEY, "FloatAdapter", "", "LongAdapter", "f", "BooleanAdapter", "g", "AnyAdapter", "Lii/a0;", "h", "UploadAdapter", IntegerTokenConverter.CONVERTER_KEY, "Lii/t;", "NullableStringAdapter", "j", "NullableDoubleAdapter", "k", "NullableIntAdapter", "l", "NullableBooleanAdapter", "m", "NullableAnyAdapter", "Lii/e;", "n", "Lii/e;", "ApolloOptionalStringAdapter", "o", "ApolloOptionalDoubleAdapter", "p", "ApolloOptionalIntAdapter", "q", "ApolloOptionalBooleanAdapter", "r", "ApolloOptionalAnyAdapter", "apollo-api"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ii.b<String> f78087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ii.b<Integer> f78088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ii.b<Double> f78089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ii.b<Float> f78090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ii.b<Long> f78091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ii.b<Boolean> f78092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ii.b<Object> f78093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ii.b<a0> f78094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t<String> f78095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t<Double> f78096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t<Integer> f78097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t<Boolean> f78098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final t<Object> f78099m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ii.e<String> f78100n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ii.e<Double> f78101o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ii.e<Integer> f78102p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ii.e<Boolean> f78103q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ii.e<Object> f78104r;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"ii/d$a", "Lii/b;", "", "Lmi/f;", "reader", "c", "(Lmi/f;)Ljava/lang/Object;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Ljava/lang/Object;)V", "Lii/k;", "customScalarAdapters", "a", "(Lmi/f;Lii/k;)Ljava/lang/Object;", "b", "(Lmi/g;Lii/k;Ljava/lang/Object;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements ii.b<Object> {
        a() {
        }

        @Override // ii.b
        public Object a(mi.f reader, k customScalarAdapters) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            return c(reader);
        }

        @Override // ii.b
        public void b(mi.g writer, k customScalarAdapters, Object value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            p013kotlin.jvm.internal.s.k(value, "value");
            d(writer, value);
        }

        public final Object c(mi.f reader) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            Object objD = mi.a.d(reader);
            p013kotlin.jvm.internal.s.h(objD);
            return objD;
        }

        public final void d(mi.g writer, Object value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(value, "value");
            mi.b.a(writer, value);
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ii/d$b", "Lii/b;", "", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Ljava/lang/Boolean;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;Z)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements ii.b<Boolean> {
        b() {
        }

        @Override // ii.b
        public /* bridge */ /* synthetic */ void b(mi.g gVar, k kVar, Boolean bool) {
            d(gVar, kVar, bool.booleanValue());
        }

        @Override // ii.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean a(mi.f reader, k customScalarAdapters) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            return Boolean.valueOf(reader.nextBoolean());
        }

        public void d(mi.g writer, k customScalarAdapters, boolean value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            writer.K(value);
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ii/d$c", "Lii/b;", "", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Ljava/lang/Double;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;D)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements ii.b<Double> {
        c() {
        }

        @Override // ii.b
        public /* bridge */ /* synthetic */ void b(mi.g gVar, k kVar, Double d11) {
            d(gVar, kVar, d11.doubleValue());
        }

        @Override // ii.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Double a(mi.f reader, k customScalarAdapters) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            return Double.valueOf(reader.nextDouble());
        }

        public void d(mi.g writer, k customScalarAdapters, double value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            writer.E(value);
        }
    }

    /* JADX INFO: renamed from: ii.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ii/d$d", "Lii/b;", "", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Ljava/lang/Float;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;F)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class C1654d implements ii.b<Float> {
        C1654d() {
        }

        @Override // ii.b
        public /* bridge */ /* synthetic */ void b(mi.g gVar, k kVar, Float f11) {
            d(gVar, kVar, f11.floatValue());
        }

        @Override // ii.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Float a(mi.f reader, k customScalarAdapters) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            return Float.valueOf((float) reader.nextDouble());
        }

        public void d(mi.g writer, k customScalarAdapters, float value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            writer.E(value);
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ii/d$e", "Lii/b;", "", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Ljava/lang/Integer;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;I)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class e implements ii.b<Integer> {
        e() {
        }

        @Override // ii.b
        public /* bridge */ /* synthetic */ void b(mi.g gVar, k kVar, Integer num) {
            d(gVar, kVar, num.intValue());
        }

        @Override // ii.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer a(mi.f reader, k customScalarAdapters) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            return Integer.valueOf(reader.nextInt());
        }

        public void d(mi.g writer, k customScalarAdapters, int value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            writer.S1(value);
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ii/d$f", "Lii/b;", "", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Ljava/lang/Long;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;J)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class f implements ii.b<Long> {
        f() {
        }

        @Override // ii.b
        public /* bridge */ /* synthetic */ void b(mi.g gVar, k kVar, Long l11) {
            d(gVar, kVar, l11.longValue());
        }

        @Override // ii.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long a(mi.f reader, k customScalarAdapters) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            return Long.valueOf(reader.nextLong());
        }

        public void d(mi.g writer, k customScalarAdapters, long value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            writer.D(value);
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ii/d$g", "Lii/b;", "", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Ljava/lang/String;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;Ljava/lang/String;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class g implements ii.b<String> {
        g() {
        }

        @Override // ii.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String a(mi.f reader, k customScalarAdapters) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            String strO = reader.O();
            p013kotlin.jvm.internal.s.h(strO);
            return strO;
        }

        @Override // ii.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(mi.g writer, k customScalarAdapters, String value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            p013kotlin.jvm.internal.s.k(value, "value");
            writer.w(value);
        }
    }

    @Metadata(d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ii/d$h", "Lii/b;", "Lii/a0;", "Lmi/f;", "reader", "Lii/k;", "customScalarAdapters", "c", "(Lmi/f;Lii/k;)Lii/a0;", "Lmi/g;", "writer", "value", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lmi/g;Lii/k;Lii/a0;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class h implements ii.b<a0> {
        h() {
        }

        @Override // ii.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a0 a(mi.f reader, k customScalarAdapters) {
            p013kotlin.jvm.internal.s.k(reader, "reader");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            throw new IllegalStateException("File Upload used in output position");
        }

        @Override // ii.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(mi.g writer, k customScalarAdapters, a0 value) {
            p013kotlin.jvm.internal.s.k(writer, "writer");
            p013kotlin.jvm.internal.s.k(customScalarAdapters, "customScalarAdapters");
            p013kotlin.jvm.internal.s.k(value, "value");
            writer.v2(value);
        }
    }

    static {
        g gVar = new g();
        f78087a = gVar;
        e eVar = new e();
        f78088b = eVar;
        c cVar = new c();
        f78089c = cVar;
        f78090d = new C1654d();
        f78091e = new f();
        b bVar = new b();
        f78092f = bVar;
        a aVar = new a();
        f78093g = aVar;
        f78094h = new h();
        f78095i = b(gVar);
        f78096j = b(cVar);
        f78097k = b(eVar);
        f78098l = b(bVar);
        f78099m = b(aVar);
        f78100n = new ii.e<>(gVar);
        f78101o = new ii.e<>(cVar);
        f78102p = new ii.e<>(eVar);
        f78103q = new ii.e<>(bVar);
        f78104r = new ii.e<>(aVar);
    }

    public static final <T> s<T> a(ii.b<T> bVar) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        return new s<>(bVar);
    }

    public static final <T> t<T> b(ii.b<T> bVar) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        return new t<>(bVar);
    }

    public static final <T> u<T> c(ii.b<T> bVar, boolean z11) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        return new u<>(bVar, z11);
    }

    public static /* synthetic */ u d(ii.b bVar, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        return c(bVar, z11);
    }

    public static final <T> y<T> e(ii.b<T> bVar) {
        p013kotlin.jvm.internal.s.k(bVar, "<this>");
        return new y<>(bVar);
    }
}
