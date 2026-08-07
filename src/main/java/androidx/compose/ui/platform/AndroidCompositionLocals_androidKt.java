package androidx.compose.ui.platform;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p020r2.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00168\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00168\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\" \u0010 \u001a\b\u0012\u0004\u0012\u00020\u000e0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019\" \u0010#\u001a\b\u0012\u0004\u0012\u00020\t0\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019\"\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020$0\u00168\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019\"\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020(0\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b)\u0010\u0019\" \u0010/\u001a\b\u0012\u0004\u0012\u00020+0\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b-\u0010.\u001a\u0004\b,\u0010\u0019¨\u00060²\u0006\u000e\u0010\r\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView;", "owner", "Lkotlin/Function0;", "Ljn0/h0;", "content", "a", "(Landroidx/compose/ui/platform/AndroidComposeView;Lwn0/p;Lr2/l;I)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Le4/g;", "n", "(Landroid/content/Context;Lr2/l;I)Le4/g;", "Landroid/content/res/Configuration;", "configuration", "Le4/d;", "m", "(Landroid/content/Context;Landroid/content/res/Configuration;Lr2/l;I)Le4/d;", "", "name", "", "l", "(Ljava/lang/String;)Ljava/lang/Void;", "Lr2/g2;", "Lr2/g2;", "f", "()Lr2/g2;", "LocalConfiguration", "b", "g", "LocalContext", "c", "h", "LocalImageVectorCache", DateTokenConverter.CONVERTER_KEY, IntegerTokenConverter.CONVERTER_KEY, "LocalResourceIdCache", "Lxa/d;", "e", "j", "LocalSavedStateRegistryOwner", "Landroid/view/View;", "k", "LocalView", "Landroidx/lifecycle/LifecycleOwner;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p020r2.g2<Configuration> f5589a = p020r2.w.d(null, a.f5595c, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p020r2.g2<Context> f5590b = p020r2.w.f(b.f5596c);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p020r2.g2<e4.d> f5591c = p020r2.w.f(c.f5597c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p020r2.g2<e4.g> f5592d = p020r2.w.f(d.f5598c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p020r2.g2<xa.d> f5593e = p020r2.w.f(e.f5599c);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p020r2.g2<View> f5594f = p020r2.w.f(f.f5600c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/Configuration;", "b", "()Landroid/content/res/Configuration;"}, k = 3, mv = {1, 8, 0})
    static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Configuration> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f5595c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.l("LocalConfiguration");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "b", "()Landroid/content/Context;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.a<Context> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f5596c = new b();

        b() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.l("LocalContext");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le4/d;", "b", "()Le4/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.a<e4.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f5597c = new c();

        c() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e4.d invoke() {
            AndroidCompositionLocals_androidKt.l("LocalImageVectorCache");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le4/g;", "b", "()Le4/g;"}, k = 3, mv = {1, 8, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<e4.g> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f5598c = new d();

        d() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e4.g invoke() {
            AndroidCompositionLocals_androidKt.l("LocalResourceIdCache");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lxa/d;", "b", "()Lxa/d;"}, k = 3, mv = {1, 8, 0})
    static final class e extends p013kotlin.jvm.internal.u implements wn0.a<xa.d> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f5599c = new e();

        e() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final xa.d invoke() {
            AndroidCompositionLocals_androidKt.l("LocalSavedStateRegistryOwner");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "b", "()Landroid/view/View;"}, k = 3, mv = {1, 8, 0})
    static final class f extends p013kotlin.jvm.internal.u implements wn0.a<View> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f5600c = new f();

        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final View invoke() {
            AndroidCompositionLocals_androidKt.l("LocalView");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/res/Configuration;", "it", "Ljn0/h0;", "a", "(Landroid/content/res/Configuration;)V"}, k = 3, mv = {1, 8, 0})
    static final class g extends p013kotlin.jvm.internal.u implements wn0.l<Configuration, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p020r2.p1<Configuration> f5601c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p020r2.p1<Configuration> p1Var) {
            super(1);
            this.f5601c = p1Var;
        }

        public final void a(Configuration configuration) {
            AndroidCompositionLocals_androidKt.c(this.f5601c, new Configuration(configuration));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Configuration configuration) {
            a(configuration);
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class h extends p013kotlin.jvm.internal.u implements wn0.l<p020r2.l0, p020r2.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d1 f5602c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$h$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements p020r2.k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d1 f5603a;

            public a(d1 d1Var) {
                this.f5603a = d1Var;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f5603a.d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(d1 d1Var) {
            super(1);
            this.f5602c = d1Var;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p020r2.k0 invoke(p020r2.l0 l0Var) {
            return new a(this.f5602c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 8, 0})
    static final class i extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f5604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ o0 f5605d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, jn0.h0> f5606e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(AndroidComposeView androidComposeView, o0 o0Var, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar) {
            super(2);
            this.f5604c = androidComposeView;
            this.f5605d = o0Var;
            this.f5606e = pVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1471621628, i11, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:131)");
            }
            z0.a(this.f5604c, this.f5605d, this.f5606e, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class j extends p013kotlin.jvm.internal.u implements wn0.p<p020r2.l, Integer, jn0.h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AndroidComposeView f5607c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.p<p020r2.l, Integer, jn0.h0> f5608d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5609e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(AndroidComposeView androidComposeView, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar, int i11) {
            super(2);
            this.f5607c = androidComposeView;
            this.f5608d = pVar;
            this.f5609e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            AndroidCompositionLocals_androidKt.a(this.f5607c, this.f5608d, lVar, p020r2.k2.a(this.f5609e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ jn0.h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class k extends p013kotlin.jvm.internal.u implements wn0.l<p020r2.l0, p020r2.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f5610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l f5611d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$k$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements p020r2.k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f5612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f5613b;

            public a(Context context, l lVar) {
                this.f5612a = context;
                this.f5613b = lVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f5612a.getApplicationContext().unregisterComponentCallbacks(this.f5613b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, l lVar) {
            super(1);
            this.f5610c = context;
            this.f5611d = lVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p020r2.k0 invoke(p020r2.l0 l0Var) {
            this.f5610c.getApplicationContext().registerComponentCallbacks(this.f5611d);
            return new a(this.f5610c, this.f5611d);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$l", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "configuration", "Ljn0/h0;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class l implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Configuration f5614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e4.d f5615b;

        l(Configuration configuration, e4.d dVar) {
            this.f5614a = configuration;
            this.f5615b = dVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
            this.f5615b.c(this.f5614a.updateFrom(configuration));
            this.f5614a.setTo(configuration);
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f5615b.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            this.f5615b.a();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr2/l0;", "Lr2/k0;", "a", "(Lr2/l0;)Lr2/k0;"}, k = 3, mv = {1, 8, 0})
    static final class m extends p013kotlin.jvm.internal.u implements wn0.l<p020r2.l0, p020r2.k0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f5616c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f5617d;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$m$a", "Lr2/k0;", "Ljn0/h0;", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class a implements p020r2.k0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f5618a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f5619b;

            public a(Context context, n nVar) {
                this.f5618a = context;
                this.f5619b = nVar;
            }

            @Override // p020r2.k0
            public void dispose() {
                this.f5618a.getApplicationContext().unregisterComponentCallbacks(this.f5619b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(Context context, n nVar) {
            super(1);
            this.f5616c = context;
            this.f5617d = nVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p020r2.k0 invoke(p020r2.l0 l0Var) {
            this.f5616c.getApplicationContext().registerComponentCallbacks(this.f5617d);
            return new a(this.f5616c, this.f5617d);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"androidx/compose/ui/platform/AndroidCompositionLocals_androidKt$n", "Landroid/content/ComponentCallbacks2;", "Landroid/content/res/Configuration;", "newConfig", "Ljn0/h0;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "onLowMemory", "()V", "", "level", "onTrimMemory", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class n implements ComponentCallbacks2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e4.g f5620a;

        n(e4.g gVar) {
            this.f5620a = gVar;
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration newConfig) {
            this.f5620a.a();
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
            this.f5620a.a();
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int level) {
            this.f5620a.a();
        }
    }

    public static final void a(AndroidComposeView androidComposeView, wn0.p<? super p020r2.l, ? super Integer, jn0.h0> pVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(1396852028);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(androidComposeView) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(pVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(1396852028, i12, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals (AndroidCompositionLocals.android.kt:91)");
            }
            Context context = androidComposeView.getContext();
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = p020r2.s3.d(new Configuration(context.getResources().getConfiguration()), null, 2, null);
                lVarV.B(objI);
            }
            p020r2.p1 p1Var = (p020r2.p1) objI;
            Object objI2 = lVarV.I();
            if (objI2 == companion.a()) {
                objI2 = new g(p1Var);
                lVarV.B(objI2);
            }
            androidComposeView.setConfigurationChangeObserver((wn0.l) objI2);
            Object objI3 = lVarV.I();
            if (objI3 == companion.a()) {
                objI3 = new o0(context);
                lVarV.B(objI3);
            }
            o0 o0Var = (o0) objI3;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                throw new IllegalStateException("Called when the ViewTreeOwnersAvailability is not yet in Available state");
            }
            Object objI4 = lVarV.I();
            if (objI4 == companion.a()) {
                objI4 = f1.b(androidComposeView, viewTreeOwners.getSavedStateRegistryOwner());
                lVarV.B(objI4);
            }
            d1 d1Var = (d1) objI4;
            jn0.h0 h0Var = jn0.h0.f84049a;
            boolean zK = lVarV.K(d1Var);
            Object objI5 = lVarV.I();
            if (zK || objI5 == companion.a()) {
                objI5 = new h(d1Var);
                lVarV.B(objI5);
            }
            Function0.c(h0Var, (wn0.l) objI5, lVarV, 6);
            p020r2.w.b(new p020r2.h2[]{f5589a.d(b(p1Var)), f5590b.d(context), k7.a.a().d(viewTreeOwners.getLifecycleOwner()), f5593e.d(viewTreeOwners.getSavedStateRegistryOwner()), a3.i.d().d(d1Var), f5594f.d(androidComposeView.getView()), f5591c.d(m(context, b(p1Var), lVarV, 0)), f5592d.d(n(context, lVarV, 0)), z0.o().d(Boolean.valueOf(((Boolean) lVarV.U(z0.p())).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release()))}, z2.c.e(1471621628, true, new i(androidComposeView, o0Var, pVar), lVarV, 54), lVarV, p020r2.h2.f106566i | 48);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new j(androidComposeView, pVar, i11));
        }
    }

    private static final Configuration b(p020r2.p1<Configuration> p1Var) {
        return p1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(p020r2.p1<Configuration> p1Var, Configuration configuration) {
        p1Var.setValue(configuration);
    }

    public static final p020r2.g2<Configuration> f() {
        return f5589a;
    }

    public static final p020r2.g2<Context> g() {
        return f5590b;
    }

    public static final p020r2.g2<LifecycleOwner> getLocalLifecycleOwner() {
        return k7.a.a();
    }

    public static final p020r2.g2<e4.d> h() {
        return f5591c;
    }

    public static final p020r2.g2<e4.g> i() {
        return f5592d;
    }

    public static final p020r2.g2<xa.d> j() {
        return f5593e;
    }

    public static final p020r2.g2<View> k() {
        return f5594f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void l(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    private static final e4.d m(Context context, Configuration configuration, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(-485908294, i11, -1, "androidx.compose.ui.platform.obtainImageVectorCache (AndroidCompositionLocals.android.kt:172)");
        }
        Object objI = lVar.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            objI = new e4.d();
            lVar.B(objI);
        }
        e4.d dVar = (e4.d) objI;
        Object objI2 = lVar.I();
        Object obj = objI2;
        if (objI2 == companion.a()) {
            Configuration configuration2 = new Configuration();
            if (configuration != null) {
                configuration2.setTo(configuration);
            }
            lVar.B(configuration2);
            obj = configuration2;
        }
        Configuration configuration3 = (Configuration) obj;
        Object objI3 = lVar.I();
        if (objI3 == companion.a()) {
            objI3 = new l(configuration3, dVar);
            lVar.B(objI3);
        }
        l lVar2 = (l) objI3;
        boolean zK = lVar.K(context);
        Object objI4 = lVar.I();
        if (zK || objI4 == companion.a()) {
            objI4 = new k(context, lVar2);
            lVar.B(objI4);
        }
        Function0.c(dVar, (wn0.l) objI4, lVar, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return dVar;
    }

    private static final e4.g n(Context context, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(-1348507246, i11, -1, "androidx.compose.ui.platform.obtainResourceIdCache (AndroidCompositionLocals.android.kt:141)");
        }
        Object objI = lVar.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            objI = new e4.g();
            lVar.B(objI);
        }
        e4.g gVar = (e4.g) objI;
        Object objI2 = lVar.I();
        if (objI2 == companion.a()) {
            objI2 = new n(gVar);
            lVar.B(objI2);
        }
        n nVar = (n) objI2;
        boolean zK = lVar.K(context);
        Object objI3 = lVar.I();
        if (zK || objI3 == companion.a()) {
            objI3 = new m(context, nVar);
            lVar.B(objI3);
        }
        Function0.c(gVar, (wn0.l) objI3, lVar, 0);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return gVar;
    }
}
