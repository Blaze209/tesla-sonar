package com.plaid.internal;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.plaid.internal.U0;
import com.plaid.link.R;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/plaid/internal/U0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class U0 extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f46726c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4488n5 f46727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V0 f46728b;

    public static final class a {
        public static U0 a(N2.i errorState) {
            p013kotlin.jvm.internal.s.k(errorState, "errorState");
            U0 u11 = new U0();
            Bundle bundle = new Bundle();
            bundle.putParcelable("error_state", errorState);
            u11.setArguments(bundle);
            return u11;
        }
    }

    public static final class b implements ViewModelProvider.Factory {
        public b() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* bridge */ /* synthetic */ androidx.p003lifecycle.c1 create(co0.d dVar, CreationExtras creationExtras) {
            return super.create(dVar, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* bridge */ /* synthetic */ androidx.p003lifecycle.c1 create(Class cls, CreationExtras creationExtras) {
            return super.create(cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            Resources resources = U0.this.getResources();
            p013kotlin.jvm.internal.s.j(resources, "getResources(...)");
            return new V0(resources);
        }
    }

    public static final WindowInsetsCompat a(View v11, WindowInsetsCompat windowInsets) {
        p013kotlin.jvm.internal.s.k(v11, "v");
        p013kotlin.jvm.internal.s.k(windowInsets, "windowInsets");
        k5.e eVarF = windowInsets.f(WindowInsetsCompat.n.h());
        p013kotlin.jvm.internal.s.j(eVarF, "getInsets(...)");
        v11.setPadding(eVarF.f84924a, eVarF.f84925b, eVarF.f84926c, eVarF.f84927d);
        return WindowInsetsCompat.f7692b;
    }

    public static final void b(U0 this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.requireActivity().onBackPressed();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f46728b = (V0) new ViewModelProvider(this, new b()).b(V0.class);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        p013kotlin.jvm.internal.s.k(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.plaid_error_fragment, viewGroup, false);
        int i11 = R.id.error_content;
        TextView textView = (TextView) gb.b.a(viewInflate, i11);
        if (textView != null) {
            i11 = R.id.error_header;
            TextView textView2 = (TextView) gb.b.a(viewInflate, i11);
            if (textView2 != null) {
                i11 = R.id.error_image;
                if (((ImageView) gb.b.a(viewInflate, i11)) != null) {
                    i11 = R.id.exit_button;
                    AppCompatButton appCompatButton = (AppCompatButton) gb.b.a(viewInflate, i11);
                    if (appCompatButton != null) {
                        i11 = R.id.plaid_close_icon;
                        if (((ImageView) gb.b.a(viewInflate, i11)) != null) {
                            LinearLayout linearLayout = (LinearLayout) viewInflate;
                            i11 = R.id.plaid_navigation;
                            LinearLayout linearLayout2 = (LinearLayout) gb.b.a(viewInflate, i11);
                            if (linearLayout2 != null) {
                                C4488n5 c4488n5 = new C4488n5(linearLayout, textView, textView2, appCompatButton, linearLayout, linearLayout2);
                                p013kotlin.jvm.internal.s.j(c4488n5, "inflate(...)");
                                this.f46727a = c4488n5;
                                ViewCompat.E0(linearLayout, new androidx.core.view.a0() { // from class: g00.i
                                    @Override // androidx.core.view.a0
                                    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                                        return U0.a(view, windowInsetsCompat);
                                    }
                                });
                                C4488n5 c4488n6 = this.f46727a;
                                if (c4488n6 == null) {
                                    p013kotlin.jvm.internal.s.B("binding");
                                    c4488n6 = null;
                                }
                                LinearLayout linearLayout3 = c4488n6.f47932a;
                                p013kotlin.jvm.internal.s.j(linearLayout3, "getRoot(...)");
                                return linearLayout3;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        N2.i state;
        V0.a aVar;
        p013kotlin.jvm.internal.s.k(view, "view");
        super.onViewCreated(view, bundle);
        C4488n5 c4488n5 = this.f46727a;
        C4488n5 c4488n6 = null;
        if (c4488n5 == null) {
            p013kotlin.jvm.internal.s.B("binding");
            c4488n5 = null;
        }
        c4488n5.f47936e.findViewById(R.id.plaid_close_icon).setOnClickListener(new View.OnClickListener() { // from class: g00.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                U0.a(this.f66822a, view2);
            }
        });
        C4488n5 c4488n7 = this.f46727a;
        if (c4488n7 == null) {
            p013kotlin.jvm.internal.s.B("binding");
            c4488n7 = null;
        }
        c4488n7.f47935d.setOnClickListener(new View.OnClickListener() { // from class: g00.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                U0.b(this.f66823a, view2);
            }
        });
        Bundle arguments = getArguments();
        if (arguments == null || (state = (N2.i) arguments.getParcelable("error_state")) == null) {
            Log.e("ErrorFragment", "No error state provided, using default UNKNOWN_ERROR state");
            m8.CREATOR.getClass();
            state = new N2.i("", m8.f47883e, "", "", "", p013kotlin.collections.v.m(), "", H3.UNKNOWN_ERROR);
        }
        p013kotlin.jvm.internal.s.h(state);
        V0 v11 = this.f46728b;
        if (v11 == null) {
            p013kotlin.jvm.internal.s.B("viewModel");
            v11 = null;
        }
        v11.getClass();
        p013kotlin.jvm.internal.s.k(state, "state");
        int i11 = V0.b.f46762a[state.f46503i.ordinal()];
        if (i11 == 1) {
            String string = v11.f46758a.getString(R.string.plaid_error_no_network_connection_title);
            p013kotlin.jvm.internal.s.j(string, "getString(...)");
            String string2 = v11.f46758a.getString(R.string.plaid_error_no_network_connection_content);
            p013kotlin.jvm.internal.s.j(string2, "getString(...)");
            String string3 = v11.f46758a.getString(R.string.plaid_error_no_network_connection_exit);
            p013kotlin.jvm.internal.s.j(string3, "getString(...)");
            aVar = new V0.a(string, string2, string3);
        } else if (i11 == 2) {
            String string4 = v11.f46758a.getString(R.string.plaid_error_session_expired_title);
            p013kotlin.jvm.internal.s.j(string4, "getString(...)");
            String string5 = v11.f46758a.getString(R.string.plaid_error_session_expired_content);
            p013kotlin.jvm.internal.s.j(string5, "getString(...)");
            String string6 = v11.f46758a.getString(R.string.plaid_error_session_expired_exit);
            p013kotlin.jvm.internal.s.j(string6, "getString(...)");
            aVar = new V0.a(string4, string5, string6);
        } else if (i11 == 3) {
            String string7 = v11.f46758a.getString(R.string.plaid_error_initialization_header);
            p013kotlin.jvm.internal.s.j(string7, "getString(...)");
            String string8 = v11.f46758a.getString(R.string.plaid_error_initialization_content);
            p013kotlin.jvm.internal.s.j(string8, "getString(...)");
            String string9 = v11.f46758a.getString(R.string.plaid_error_initialization_button_text);
            p013kotlin.jvm.internal.s.j(string9, "getString(...)");
            aVar = new V0.a(string7, string8, string9);
        } else if (i11 == 4) {
            String string10 = v11.f46758a.getString(R.string.plaid_error_internal_server_error_something_went_wrong);
            p013kotlin.jvm.internal.s.j(string10, "getString(...)");
            String string11 = v11.f46758a.getString(R.string.plaid_error_internal_server_error_try_again_later);
            p013kotlin.jvm.internal.s.j(string11, "getString(...)");
            String string12 = v11.f46758a.getString(R.string.plaid_error_internal_error_exit);
            p013kotlin.jvm.internal.s.j(string12, "getString(...)");
            aVar = new V0.a(string10, string11, string12);
        } else {
            if (i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            String string13 = v11.f46758a.getString(R.string.plaid_error_fallback_header);
            p013kotlin.jvm.internal.s.j(string13, "getString(...)");
            String string14 = v11.f46758a.getString(R.string.plaid_error_fallback_content);
            p013kotlin.jvm.internal.s.j(string14, "getString(...)");
            String string15 = v11.f46758a.getString(R.string.plaid_error_fallback_button_text);
            p013kotlin.jvm.internal.s.j(string15, "getString(...)");
            aVar = new V0.a(string13, string14, string15);
        }
        C4488n5 c4488n8 = this.f46727a;
        if (c4488n8 == null) {
            p013kotlin.jvm.internal.s.B("binding");
            c4488n8 = null;
        }
        c4488n8.f47934c.setText(aVar.f46759a);
        C4488n5 c4488n9 = this.f46727a;
        if (c4488n9 == null) {
            p013kotlin.jvm.internal.s.B("binding");
            c4488n9 = null;
        }
        c4488n9.f47933b.setText(aVar.f46760b);
        C4488n5 c4488n10 = this.f46727a;
        if (c4488n10 == null) {
            p013kotlin.jvm.internal.s.B("binding");
        } else {
            c4488n6 = c4488n10;
        }
        c4488n6.f47935d.setText(aVar.f46761c);
    }

    public static final void a(U0 this$0, View view) {
        p013kotlin.jvm.internal.s.k(this$0, "this$0");
        this$0.requireActivity().onBackPressed();
    }
}
