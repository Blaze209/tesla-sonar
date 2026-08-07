package com.plaid.internal;

import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.p003lifecycle.ViewModelProvider;
import com.plaid.internal.p8;
import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes6.dex */
public abstract class k8<VM extends p8> extends Fragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47814d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<VM> f47815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public VM f47816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f47817c;

    public static final class a extends p013kotlin.jvm.internal.u implements wn0.l<J4, p8> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k8<VM> f47818a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k8<VM> k8Var) {
            super(1);
            this.f47818a = k8Var;
        }

        @Override // wn0.l
        public final p8 invoke(J4 j11) {
            J4 component = j11;
            p013kotlin.jvm.internal.s.k(component, "component");
            k8<VM> k8Var = this.f47818a;
            m8 m8Var = (m8) k8Var.f47817c.getValue();
            p013kotlin.jvm.internal.s.j(m8Var, "access$getModelId(...)");
            return k8Var.a(m8Var, component);
        }
    }

    public k8() {
        p013kotlin.jvm.internal.s.k(C4466l1.class, "viewModelClass");
        this.f47815a = C4466l1.class;
        this.f47817c = jn0.m.b(new j8(this));
    }

    public abstract C4466l1 a(m8 m8Var, J4 j11);

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater.Factory activity = getActivity();
        p013kotlin.jvm.internal.s.i(activity, "null cannot be cast to non-null type com.plaid.internal.workflow.panes.WorkflowViewModelFactoryProvider");
        VM vm2 = (VM) new ViewModelProvider(this, ((r8) activity).a(new a(this))).b(this.f47815a);
        p013kotlin.jvm.internal.s.k(vm2, "<set-?>");
        this.f47816b = vm2;
    }
}
