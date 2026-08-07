package oh0;

import a30.ViewEnvironment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: oh0.l, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006 "}, d2 = {"Loh0/l;", "La30/b;", "Loh0/d0;", "permission", "", "isPermanentPermissionRejectionCheck", "Lkotlin/Function1;", "Ljn0/h0;", "callback", "<init>", "(Loh0/d0;ZLwn0/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Loh0/d0;", "b", "Z", "c", "Lwn0/l;", "La30/c0;", DateTokenConverter.CONVERTER_KEY, "La30/c0;", "()La30/c0;", "viewFactory", "permissions_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class CheckRequestPermissionRationaleStateView implements a30.b<CheckRequestPermissionRationaleStateView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final d0 permission;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPermanentPermissionRejectionCheck;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final wn0.l<Boolean, jn0.h0> callback;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a30.c0<CheckRequestPermissionRationaleStateView> viewFactory;

    /* JADX INFO: renamed from: oh0.l$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgb/a;", "BindingT", "", "RenderingT", "binding", "La30/k;", "a", "(Lgb/a;)La30/k;"}, k = 3, mv = {2, 0, 0})
    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<ph0.a, a30.k<CheckRequestPermissionRationaleStateView>> {

        /* JADX INFO: renamed from: oh0.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\n\b\u0001\u0010\u0003\u0018\u0001*\u00020\u0002\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lgb/a;", "BindingT", "", "RenderingT", "rendering", "La30/a0;", "viewEnvironment", "Ljn0/h0;", "a", "(Ljava/lang/Object;La30/a0;)V"}, k = 3, mv = {2, 0, 0})
        public static final class C2095a<RenderingT> implements a30.k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ gb.a f97427b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CheckRequestPermissionRationaleStateView f97428c;

            public C2095a(gb.a aVar, CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView) {
                this.f97427b = aVar;
                this.f97428c = checkRequestPermissionRationaleStateView;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // a30.k
            public final void a(RenderingT rendering, ViewEnvironment viewEnvironment) {
                p013kotlin.jvm.internal.s.k(rendering, "rendering");
                p013kotlin.jvm.internal.s.k(viewEnvironment, "viewEnvironment");
                CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = (CheckRequestPermissionRationaleStateView) rendering;
                ph0.a aVar = (ph0.a) this.f97427b;
                Context context = aVar.getRoot().getContext();
                p013kotlin.jvm.internal.s.j(context, "getContext(...)");
                androidx.appcompat.app.c cVarG = yh0.f.g(context);
                if (checkRequestPermissionRationaleStateView.callback != null) {
                    aVar.getRoot().post(new c(aVar, this.f97428c, checkRequestPermissionRationaleStateView, cVarG));
                }
            }
        }

        public a() {
            super(1);
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a30.k<CheckRequestPermissionRationaleStateView> invoke(ph0.a binding) {
            p013kotlin.jvm.internal.s.k(binding, "binding");
            return new C2095a(binding, CheckRequestPermissionRationaleStateView.this);
        }
    }

    /* JADX INFO: renamed from: oh0.l$b */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* synthetic */ class b extends p013kotlin.jvm.internal.p implements wn0.q<LayoutInflater, ViewGroup, Boolean, ph0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f97429a = new b();

        b() {
            super(3, ph0.a.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/withpersona/sdk2/inquiry/permissions/databinding/Pi2CheckRequestPermissionRationaleStateBinding;", 0);
        }

        public final ph0.a a(LayoutInflater p11, ViewGroup viewGroup, boolean z11) {
            p013kotlin.jvm.internal.s.k(p11, "p0");
            return ph0.a.b(p11, viewGroup, z11);
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ ph0.a invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
            return a(layoutInflater, viewGroup, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: oh0.l$c */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ph0.a f97430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckRequestPermissionRationaleStateView f97431b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ CheckRequestPermissionRationaleStateView f97432c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.app.c f97433d;

        c(ph0.a aVar, CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView, CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView2, androidx.appcompat.app.c cVar) {
            this.f97430a = aVar;
            this.f97431b = checkRequestPermissionRationaleStateView;
            this.f97432c = checkRequestPermissionRationaleStateView2;
            this.f97433d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f97430a.getRoot().isAttachedToWindow()) {
                if (this.f97431b.permission != d0.RecordAudio || this.f97431b.isPermanentPermissionRejectionCheck) {
                    this.f97432c.callback.invoke(Boolean.valueOf(androidx.core.app.b.i(this.f97433d, k1.b(this.f97432c.permission))));
                } else {
                    this.f97432c.callback.invoke(Boolean.TRUE);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckRequestPermissionRationaleStateView(d0 permission, boolean z11, wn0.l<? super Boolean, jn0.h0> lVar) {
        p013kotlin.jvm.internal.s.k(permission, "permission");
        this.permission = permission;
        this.isPermanentPermissionRejectionCheck = z11;
        this.callback = lVar;
        a30.k.Companion companion = a30.k.INSTANCE;
        this.viewFactory = new a30.z(p013kotlin.jvm.internal.o0.b(CheckRequestPermissionRationaleStateView.class), b.f97429a, new a());
    }

    @Override // a30.b
    public a30.c0<CheckRequestPermissionRationaleStateView> a() {
        return this.viewFactory;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckRequestPermissionRationaleStateView)) {
            return false;
        }
        CheckRequestPermissionRationaleStateView checkRequestPermissionRationaleStateView = (CheckRequestPermissionRationaleStateView) other;
        return this.permission == checkRequestPermissionRationaleStateView.permission && this.isPermanentPermissionRejectionCheck == checkRequestPermissionRationaleStateView.isPermanentPermissionRejectionCheck && p013kotlin.jvm.internal.s.f(this.callback, checkRequestPermissionRationaleStateView.callback);
    }

    public int hashCode() {
        int iHashCode = ((this.permission.hashCode() * 31) + Boolean.hashCode(this.isPermanentPermissionRejectionCheck)) * 31;
        wn0.l<Boolean, jn0.h0> lVar = this.callback;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }

    public String toString() {
        return "CheckRequestPermissionRationaleStateView(permission=" + this.permission + ", isPermanentPermissionRejectionCheck=" + this.isPermanentPermissionRejectionCheck + ", callback=" + this.callback + ")";
    }
}
