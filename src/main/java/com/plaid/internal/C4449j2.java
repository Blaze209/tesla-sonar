package com.plaid.internal;

import com.plaid.internal.link.LinkActivity;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.plaid.internal.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4449j2 extends androidx.p003lifecycle.c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4483n0 f47764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G2 f47765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4547u2 f47766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z2 f47767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final A2 f47768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Job f47769f;

    /* JADX INFO: renamed from: com.plaid.internal.j2$a */
    public static final class a implements androidx.p003lifecycle.j0, p013kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkActivity.b f47770a;

        public a(LinkActivity.b function) {
            p013kotlin.jvm.internal.s.k(function, "function");
            this.f47770a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.p003lifecycle.j0) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(this.f47770a, ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return this.f47770a;
        }

        public final int hashCode() {
            return this.f47770a.hashCode();
        }

        @Override // androidx.p003lifecycle.j0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f47770a.invoke(obj);
        }
    }

    public C4449j2(InterfaceC4344a3 tokenComponent) {
        p013kotlin.jvm.internal.s.k(tokenComponent, "tokenComponent");
        C4492o0 c4492o0 = (C4492o0) tokenComponent;
        C4501p0 c4501p0 = c4492o0.f47954a;
        C4483n0 c4483n0 = new C4483n0(c4501p0, c4492o0.f47955b, new I1());
        c4501p0.f48023p.get();
        this.f47765b = c4483n0.f47895d.get();
        this.f47766c = c4483n0.f47905n.get();
        c4501p0.f48016i.get();
        this.f47767d = c4501p0.f48013f.get();
        c4501p0.f48015h.get();
        this.f47768e = c4501p0.f48017j.get();
        this.f47764a = c4483n0;
    }

    public final void a(AbstractC4587y6 abstractC4587y6) {
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new C4431h2(abstractC4587y6, this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        C4440i2 c4440i2;
        if (continuationImpl instanceof C4440i2) {
            c4440i2 = (C4440i2) continuationImpl;
            int i11 = c4440i2.f47730c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4440i2.f47730c = i11 - Integer.MIN_VALUE;
            } else {
                c4440i2 = new C4440i2(this, continuationImpl);
            }
        } else {
            c4440i2 = new C4440i2(this, continuationImpl);
        }
        Object obj = c4440i2.f47728a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c4440i2.f47730c;
        if (i12 == 0) {
            jn0.t.b(obj);
            InterfaceC4547u2 interfaceC4547u2 = this.f47766c;
            if (interfaceC4547u2 == null) {
                p013kotlin.jvm.internal.s.B("controller");
                interfaceC4547u2 = null;
            }
            c4440i2.f47730c = 1;
            if (interfaceC4547u2.a(c4440i2) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        return Boxing.boxBoolean(true);
    }
}
