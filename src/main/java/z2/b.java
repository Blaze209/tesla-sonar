package z2;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p013kotlin.jvm.internal.u0;
import p020r2.i2;
import p020r2.k2;
import p020r2.l;
import p020r2.w2;
import wn0.p;
import wn0.q;
import wn0.r;
import wn0.t;
import wn0.v;
import wn0.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u001b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ@\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJJ\u0010!\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b!\u0010\"JT\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010$J^\u0010&\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b&\u0010'Jh\u0010)\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010#\u001a\u0004\u0018\u00010\u00062\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010(\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010+\u001a\u0004\b,\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010.R\u0018\u00100\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00107\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106¨\u00068"}, d2 = {"Lz2/b;", "Lz2/a;", "", Action.KEY_ATTRIBUTE, "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "Ljn0/h0;", "q", "()V", "Lr2/l;", "composer", "p", "(Lr2/l;)V", "r", "(Ljava/lang/Object;)V", "c", "changed", "o", "(Lr2/l;I)Ljava/lang/Object;", "p1", "l", "(Ljava/lang/Object;Lr2/l;I)Ljava/lang/Object;", "p2", "j", "(Ljava/lang/Object;Ljava/lang/Object;Lr2/l;I)Ljava/lang/Object;", "p3", "f", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr2/l;I)Ljava/lang/Object;", "p4", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr2/l;I)Ljava/lang/Object;", "p5", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr2/l;I)Ljava/lang/Object;", "p6", "b", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr2/l;I)Ljava/lang/Object;", "p7", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lr2/l;I)Ljava/lang/Object;", "I", "getKey", "()I", "Z", "Ljava/lang/Object;", "_block", "Lr2/i2;", DateTokenConverter.CONVERTER_KEY, "Lr2/i2;", "scope", "", "Ljava/util/List;", "scopes", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements z2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean tracked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object _block;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private i2 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<i2> scopes;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr2/l;", "nc", "", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f126506d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f126507e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, int i11) {
            super(2);
            this.f126506d = obj;
            this.f126507e = i11;
        }

        public final void a(l lVar, int i11) {
            b.this.l(this.f126506d, lVar, k2.a(this.f126507e) | 1);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: z2.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr2/l;", "nc", "", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class C2742b extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f126509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f126510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f126511f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2742b(Object obj, Object obj2, int i11) {
            super(2);
            this.f126509d = obj;
            this.f126510e = obj2;
            this.f126511f = i11;
        }

        public final void a(l lVar, int i11) {
            b.this.j(this.f126509d, this.f126510e, lVar, k2.a(this.f126511f) | 1);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr2/l;", "nc", "", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f126513d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f126514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f126515f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f126516g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, Object obj2, Object obj3, int i11) {
            super(2);
            this.f126513d = obj;
            this.f126514e = obj2;
            this.f126515f = obj3;
            this.f126516g = i11;
        }

        public final void a(l lVar, int i11) {
            b.this.f(this.f126513d, this.f126514e, this.f126515f, lVar, k2.a(this.f126516g) | 1);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr2/l;", "nc", "", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f126518d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f126519e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f126520f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f126521g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f126522h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Object obj2, Object obj3, Object obj4, int i11) {
            super(2);
            this.f126518d = obj;
            this.f126519e = obj2;
            this.f126520f = obj3;
            this.f126521g = obj4;
            this.f126522h = i11;
        }

        public final void a(l lVar, int i11) {
            b.this.e(this.f126518d, this.f126519e, this.f126520f, this.f126521g, lVar, k2.a(this.f126522h) | 1);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr2/l;", "nc", "", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f126524d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f126525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f126526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f126527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f126528h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f126529i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
            super(2);
            this.f126524d = obj;
            this.f126525e = obj2;
            this.f126526f = obj3;
            this.f126527g = obj4;
            this.f126528h = obj5;
            this.f126529i = i11;
        }

        public final void a(l lVar, int i11) {
            b.this.c(this.f126524d, this.f126525e, this.f126526f, this.f126527g, this.f126528h, lVar, k2.a(this.f126529i) | 1);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr2/l;", "nc", "", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class f extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f126531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f126532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f126533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f126534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f126535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f126536i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f126537j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i11) {
            super(2);
            this.f126531d = obj;
            this.f126532e = obj2;
            this.f126533f = obj3;
            this.f126534g = obj4;
            this.f126535h = obj5;
            this.f126536i = obj6;
            this.f126537j = i11;
        }

        public final void a(l lVar, int i11) {
            b.this.b(this.f126531d, this.f126532e, this.f126533f, this.f126534g, this.f126535h, this.f126536i, lVar, k2.a(this.f126537j) | 1);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr2/l;", "nc", "", "<anonymous parameter 1>", "Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f126539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f126540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f126541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f126542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f126543h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f126544i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f126545j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f126546k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i11) {
            super(2);
            this.f126539d = obj;
            this.f126540e = obj2;
            this.f126541f = obj3;
            this.f126542g = obj4;
            this.f126543h = obj5;
            this.f126544i = obj6;
            this.f126545j = obj7;
            this.f126546k = i11;
        }

        public final void a(l lVar, int i11) {
            b.this.a(this.f126539d, this.f126540e, this.f126541f, this.f126542g, this.f126543h, this.f126544i, this.f126545j, lVar, k2.a(this.f126546k) | 1);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public b(int i11, boolean z11, Object obj) {
        this.key = i11;
        this.tracked = z11;
        this._block = obj;
    }

    private final void p(l composer) {
        i2 i2VarF;
        if (!this.tracked || (i2VarF = composer.F()) == null) {
            return;
        }
        composer.P(i2VarF);
        if (z2.c.f(this.scope, i2VarF)) {
            this.scope = i2VarF;
            return;
        }
        List<i2> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(i2VarF);
            return;
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (z2.c.f(list.get(i11), i2VarF)) {
                list.set(i11, i2VarF);
                return;
            }
        }
        list.add(i2VarF);
    }

    private final void q() {
        if (this.tracked) {
            i2 i2Var = this.scope;
            if (i2Var != null) {
                i2Var.invalidate();
                this.scope = null;
            }
            List<i2> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.get(i11).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object a(Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, Object p17, l c11, int changed) {
        l lVarV = c11.v(this.key);
        p(lVarV);
        int iD = lVarV.n(this) ? z2.c.d(7) : z2.c.g(7);
        Object obj = this._block;
        s.i(obj, "null cannot be cast to non-null type kotlin.Function9<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'p7')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objM = ((w) u0.g(obj, 9)).m(p11, p12, p13, p14, p15, p16, p17, lVarV, Integer.valueOf(changed | iD));
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(p11, p12, p13, p14, p15, p16, p17, changed));
        }
        return objM;
    }

    public Object b(Object p11, Object p12, Object p13, Object p14, Object p15, Object p16, l c11, int changed) {
        l lVarV = c11.v(this.key);
        p(lVarV);
        int iD = lVarV.n(this) ? z2.c.d(6) : z2.c.g(6);
        Object obj = this._block;
        s.i(obj, "null cannot be cast to non-null type kotlin.Function8<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'p6')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objG = ((v) u0.g(obj, 8)).g(p11, p12, p13, p14, p15, p16, lVarV, Integer.valueOf(changed | iD));
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new f(p11, p12, p13, p14, p15, p16, changed));
        }
        return objG;
    }

    public Object c(Object p11, Object p12, Object p13, Object p14, Object p15, l c11, int changed) {
        l lVarV = c11.v(this.key);
        p(lVarV);
        int iD = lVarV.n(this) ? z2.c.d(5) : z2.c.g(5);
        Object obj = this._block;
        s.i(obj, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objK = ((wn0.u) u0.g(obj, 7)).k(p11, p12, p13, p14, p15, lVarV, Integer.valueOf(changed | iD));
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new e(p11, p12, p13, p14, p15, changed));
        }
        return objK;
    }

    @Override // wn0.s
    public /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, Object obj3, l lVar, Integer num) {
        return f(obj, obj2, obj3, lVar, num.intValue());
    }

    public Object e(Object p11, Object p12, Object p13, Object p14, l c11, int changed) {
        l lVarV = c11.v(this.key);
        p(lVarV);
        int iD = lVarV.n(this) ? z2.c.d(4) : z2.c.g(4);
        Object obj = this._block;
        s.i(obj, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objI = ((t) u0.g(obj, 6)).i(p11, p12, p13, p14, lVarV, Integer.valueOf(iD | changed));
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(p11, p12, p13, p14, changed));
        }
        return objI;
    }

    public Object f(Object p11, Object p12, Object p13, l c11, int changed) {
        l lVarV = c11.v(this.key);
        p(lVarV);
        int iD = lVarV.n(this) ? z2.c.d(3) : z2.c.g(3);
        Object obj = this._block;
        s.i(obj, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objD = ((wn0.s) u0.g(obj, 5)).d(p11, p12, p13, lVarV, Integer.valueOf(iD | changed));
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(p11, p12, p13, changed));
        }
        return objD;
    }

    @Override // wn0.v
    public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, l lVar, Integer num) {
        return b(obj, obj2, obj3, obj4, obj5, obj6, lVar, num.intValue());
    }

    @Override // wn0.t
    public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, l lVar, Integer num) {
        return e(obj, obj2, obj3, obj4, lVar, num.intValue());
    }

    @Override // wn0.p
    public /* bridge */ /* synthetic */ Object invoke(l lVar, Integer num) {
        return o(lVar, num.intValue());
    }

    public Object j(Object p11, Object p12, l c11, int changed) {
        l lVarV = c11.v(this.key);
        p(lVarV);
        int iD = lVarV.n(this) ? z2.c.d(2) : z2.c.g(2);
        Object obj = this._block;
        s.i(obj, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((r) u0.g(obj, 4)).invoke(p11, p12, lVarV, Integer.valueOf(iD | changed));
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new C2742b(p11, p12, changed));
        }
        return objInvoke;
    }

    @Override // wn0.u
    public /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, l lVar, Integer num) {
        return c(obj, obj2, obj3, obj4, obj5, lVar, num.intValue());
    }

    public Object l(Object p11, l c11, int changed) {
        l lVarV = c11.v(this.key);
        p(lVarV);
        int iD = lVarV.n(this) ? z2.c.d(1) : z2.c.g(1);
        Object obj = this._block;
        s.i(obj, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((q) u0.g(obj, 3)).invoke(p11, lVarV, Integer.valueOf(iD | changed));
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(p11, changed));
        }
        return objInvoke;
    }

    @Override // wn0.w
    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, l lVar, Integer num) {
        return a(obj, obj2, obj3, obj4, obj5, obj6, obj7, lVar, num.intValue());
    }

    public Object o(l c11, int changed) {
        l lVarV = c11.v(this.key);
        p(lVarV);
        int iD = changed | (lVarV.n(this) ? z2.c.d(0) : z2.c.g(0));
        Object obj = this._block;
        s.i(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((p) u0.g(obj, 2)).invoke(lVarV, Integer.valueOf(iD));
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            s.i(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            w2VarX.a((p) u0.g(this, 2));
        }
        return objInvoke;
    }

    public final void r(Object block) {
        if (s.f(this._block, block)) {
            return;
        }
        boolean z11 = this._block == null;
        this._block = block;
        if (z11) {
            return;
        }
        q();
    }

    @Override // wn0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, l lVar, Integer num) {
        return l(obj, lVar, num.intValue());
    }

    @Override // wn0.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, l lVar, Integer num) {
        return j(obj, obj2, lVar, num.intValue());
    }
}
