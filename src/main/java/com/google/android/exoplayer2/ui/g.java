package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.f2;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.u0;
import com.google.android.exoplayer2.v1;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class g extends FrameLayout {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final float[] f40885x0;
    private final View A;
    private final View B;
    private final TextView C;
    private final TextView D;
    private final e0 E;
    private final StringBuilder F;
    private final Formatter G;
    private final f2.b H;
    private final f2.d I;
    private final Runnable J;
    private final Drawable K;
    private final Drawable L;
    private final Drawable M;
    private final String N;
    private final String O;
    private final String P;
    private final Drawable Q;
    private final Drawable R;
    private final float S;
    private final float T;
    private final String U;
    private final String V;
    private final Drawable W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f40886a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final Drawable f40887a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f40888b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final String f40889b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f40890c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final String f40891c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f40892d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final Drawable f40893d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RecyclerView f40894e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final Drawable f40895e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f40896f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final String f40897f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e f40898g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final String f40899g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f40900h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private v1 f40901h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b f40902i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private d f40903i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final rs.u f40904j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private boolean f40905j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final PopupWindow f40906k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f40907k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f40908l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private boolean f40909l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f40910m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private boolean f40911m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f40912n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private boolean f40913n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final View f40914o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f40915o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final View f40916p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f40917p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f40918q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f40919q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final TextView f40920r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private long[] f40921r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final TextView f40922s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean[] f40923s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ImageView f40924t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private long[] f40925t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ImageView f40926u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean[] f40927u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final View f40928v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private long f40929v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final ImageView f40930w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f40931w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final ImageView f40932x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final ImageView f40933y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final View f40934z;

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends l {
        private b() {
            super();
        }

        public static /* synthetic */ void g(b bVar, View view) {
            if (g.this.f40901h0 == null || !g.this.f40901h0.c0(29)) {
                return;
            }
            ((v1) p0.j(g.this.f40901h0)).H0(g.this.f40901h0.s().A().B(1).J(1, false).A());
            g.this.f40896f.d(1, g.this.getResources().getString(rs.o.f109162w));
            g.this.f40906k.dismiss();
        }

        private boolean h(qs.y yVar) {
            for (int i11 = 0; i11 < this.f40955a.size(); i11++) {
                if (yVar.f106116y.containsKey(this.f40955a.get(i11).f40952a.b())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.ui.g.l
        public void d(i iVar) {
            iVar.f40949a.setText(rs.o.f109162w);
            iVar.f40950b.setVisibility(h(((v1) ts.a.e(g.this.f40901h0)).s()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.b.g(this.f40957a, view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.g.l
        public void f(String str) {
            g.this.f40896f.d(1, str);
        }

        public void i(List<k> list) {
            this.f40955a = list;
            qs.y yVarS = ((v1) ts.a.e(g.this.f40901h0)).s();
            if (list.isEmpty()) {
                g.this.f40896f.d(1, g.this.getResources().getString(rs.o.f109163x));
                return;
            }
            if (!h(yVarS)) {
                g.this.f40896f.d(1, g.this.getResources().getString(rs.o.f109162w));
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                k kVar = list.get(i11);
                if (kVar.a()) {
                    g.this.f40896f.d(1, kVar.f40954c);
                    return;
                }
            }
        }
    }

    private final class c implements v1.d, e0.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // com.google.android.exoplayer2.ui.e0.a
        public void n(e0 e0Var, long j11, boolean z11) {
            g.this.f40913n0 = false;
            if (!z11 && g.this.f40901h0 != null) {
                g gVar = g.this;
                gVar.k0(gVar.f40901h0, j11);
            }
            g.this.f40886a.S();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            v1 v1Var = g.this.f40901h0;
            if (v1Var == null) {
                return;
            }
            g.this.f40886a.S();
            if (g.this.f40912n == view) {
                if (v1Var.c0(9)) {
                    v1Var.K();
                    return;
                }
                return;
            }
            if (g.this.f40910m == view) {
                if (v1Var.c0(7)) {
                    v1Var.F();
                    return;
                }
                return;
            }
            if (g.this.f40916p == view) {
                if (v1Var.g() == 4 || !v1Var.c0(12)) {
                    return;
                }
                v1Var.C();
                return;
            }
            if (g.this.f40918q == view) {
                if (v1Var.c0(11)) {
                    v1Var.U();
                    return;
                }
                return;
            }
            if (g.this.f40914o == view) {
                p0.o0(v1Var);
                return;
            }
            if (g.this.f40924t == view) {
                if (v1Var.c0(15)) {
                    v1Var.i(ts.f0.a(v1Var.h(), g.this.f40919q0));
                    return;
                }
                return;
            }
            if (g.this.f40926u == view) {
                if (v1Var.c0(14)) {
                    v1Var.u(!v1Var.T());
                    return;
                }
                return;
            }
            if (g.this.f40934z == view) {
                g.this.f40886a.R();
                g gVar = g.this;
                gVar.U(gVar.f40896f, g.this.f40934z);
                return;
            }
            if (g.this.A == view) {
                g.this.f40886a.R();
                g gVar2 = g.this;
                gVar2.U(gVar2.f40898g, g.this.A);
            } else if (g.this.B == view) {
                g.this.f40886a.R();
                g gVar3 = g.this;
                gVar3.U(gVar3.f40902i, g.this.B);
            } else if (g.this.f40930w == view) {
                g.this.f40886a.R();
                g gVar4 = g.this;
                gVar4.U(gVar4.f40900h, g.this.f40930w);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (g.this.f40931w0) {
                g.this.f40886a.S();
            }
        }

        @Override // com.google.android.exoplayer2.v1.d
        public void onEvents(v1 v1Var, v1.c cVar) {
            if (cVar.a(4, 5, 13)) {
                g.this.t0();
            }
            if (cVar.a(4, 5, 7, 13)) {
                g.this.v0();
            }
            if (cVar.a(8, 13)) {
                g.this.w0();
            }
            if (cVar.a(9, 13)) {
                g.this.A0();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                g.this.s0();
            }
            if (cVar.a(11, 0, 13)) {
                g.this.B0();
            }
            if (cVar.a(12, 13)) {
                g.this.u0();
            }
            if (cVar.a(2, 13)) {
                g.this.C0();
            }
        }

        @Override // com.google.android.exoplayer2.ui.e0.a
        public void q(e0 e0Var, long j11) {
            if (g.this.D != null) {
                g.this.D.setText(p0.f0(g.this.F, g.this.G, j11));
            }
        }

        @Override // com.google.android.exoplayer2.ui.e0.a
        public void u(e0 e0Var, long j11) {
            g.this.f40913n0 = true;
            if (g.this.D != null) {
                g.this.D.setText(p0.f0(g.this.F, g.this.G, j11));
            }
            g.this.f40886a.R();
        }
    }

    @Deprecated
    public interface d {
        void q(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f40937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f40938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f40939c;

        public e(String[] strArr, float[] fArr) {
            this.f40937a = strArr;
            this.f40938b = fArr;
        }

        public static /* synthetic */ void a(e eVar, int i11, View view) {
            if (i11 != eVar.f40939c) {
                g.this.setPlaybackSpeed(eVar.f40938b[i11]);
            }
            g.this.f40906k.dismiss();
        }

        public String b() {
            return this.f40937a[this.f40939c];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i11) {
            String[] strArr = this.f40937a;
            if (i11 < strArr.length) {
                iVar.f40949a.setText(strArr[i11]);
            }
            if (i11 == this.f40939c) {
                iVar.itemView.setSelected(true);
                iVar.f40950b.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f40950b.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.e.a(this.f40958a, i11, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new i(LayoutInflater.from(g.this.getContext()).inflate(rs.m.f109137e, viewGroup, false));
        }

        public void e(float f11) {
            int i11 = 0;
            float f12 = Float.MAX_VALUE;
            int i12 = 0;
            while (true) {
                float[] fArr = this.f40938b;
                if (i11 >= fArr.length) {
                    this.f40939c = i12;
                    return;
                }
                float fAbs = Math.abs(f11 - fArr[i11]);
                if (fAbs < f12) {
                    i12 = i11;
                    f12 = fAbs;
                }
                i11++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f40937a.length;
        }
    }

    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.g$g, reason: collision with other inner class name */
    final class C0654g extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f40941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f40942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImageView f40943c;

        public C0654g(View view) {
            super(view);
            if (p0.f115040a < 26) {
                view.setFocusable(true);
            }
            this.f40941a = (TextView) view.findViewById(rs.k.f109125u);
            this.f40942b = (TextView) view.findViewById(rs.k.N);
            this.f40943c = (ImageView) view.findViewById(rs.k.f109124t);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    g.C0654g c0654g = this.f40960a;
                    g.this.h0(c0654g.getAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h extends RecyclerView.h<C0654g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f40945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f40946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Drawable[] f40947c;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f40945a = strArr;
            this.f40946b = new String[strArr.length];
            this.f40947c = drawableArr;
        }

        private boolean e(int i11) {
            if (g.this.f40901h0 == null) {
                return false;
            }
            if (i11 == 0) {
                return g.this.f40901h0.c0(13);
            }
            if (i11 != 1) {
                return true;
            }
            return g.this.f40901h0.c0(30) && g.this.f40901h0.c0(29);
        }

        public boolean a() {
            return e(1) || e(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(C0654g c0654g, int i11) {
            if (e(i11)) {
                c0654g.itemView.setLayoutParams(new RecyclerView.r(-1, -2));
            } else {
                c0654g.itemView.setLayoutParams(new RecyclerView.r(0, 0));
            }
            c0654g.f40941a.setText(this.f40945a[i11]);
            if (this.f40946b[i11] == null) {
                c0654g.f40942b.setVisibility(8);
            } else {
                c0654g.f40942b.setText(this.f40946b[i11]);
            }
            if (this.f40947c[i11] == null) {
                c0654g.f40943c.setVisibility(8);
            } else {
                c0654g.f40943c.setImageDrawable(this.f40947c[i11]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C0654g onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return g.this.new C0654g(LayoutInflater.from(g.this.getContext()).inflate(rs.m.f109136d, viewGroup, false));
        }

        public void d(int i11, String str) {
            this.f40946b[i11] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f40945a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i11) {
            return i11;
        }
    }

    private static class i extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f40949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f40950b;

        public i(View view) {
            super(view);
            if (p0.f115040a < 26) {
                view.setFocusable(true);
            }
            this.f40949a = (TextView) view.findViewById(rs.k.Q);
            this.f40950b = view.findViewById(rs.k.f109112h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class j extends l {
        private j() {
            super();
        }

        public static /* synthetic */ void g(j jVar, View view) {
            if (g.this.f40901h0 == null || !g.this.f40901h0.c0(29)) {
                return;
            }
            g.this.f40901h0.H0(g.this.f40901h0.s().A().B(3).F(-3).A());
            g.this.f40906k.dismiss();
        }

        @Override // com.google.android.exoplayer2.ui.g.l, androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i11) {
            super.onBindViewHolder(iVar, i11);
            if (i11 > 0) {
                iVar.f40950b.setVisibility(this.f40955a.get(i11 + (-1)).a() ? 0 : 4);
            }
        }

        @Override // com.google.android.exoplayer2.ui.g.l
        public void d(i iVar) {
            boolean z11;
            iVar.f40949a.setText(rs.o.f109163x);
            int i11 = 0;
            while (true) {
                if (i11 >= this.f40955a.size()) {
                    z11 = true;
                    break;
                } else {
                    if (this.f40955a.get(i11).a()) {
                        z11 = false;
                        break;
                    }
                    i11++;
                }
            }
            iVar.f40950b.setVisibility(z11 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.j.g(this.f40961a, view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.g.l
        public void f(String str) {
        }

        public void h(List<k> list) {
            boolean z11 = false;
            for (int i11 = 0; i11 < list.size(); i11++) {
                if (list.get(i11).a()) {
                    z11 = true;
                    break;
                }
            }
            if (g.this.f40930w != null) {
                ImageView imageView = g.this.f40930w;
                g gVar = g.this;
                imageView.setImageDrawable(z11 ? gVar.W : gVar.f40887a0);
                g.this.f40930w.setContentDescription(z11 ? g.this.f40889b0 : g.this.f40891c0);
            }
            this.f40955a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g2.a f40952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f40953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f40954c;

        public k(g2 g2Var, int i11, int i12, String str) {
            this.f40952a = g2Var.b().get(i11);
            this.f40953b = i12;
            this.f40954c = str;
        }

        public boolean a() {
            return this.f40952a.g(this.f40953b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class l extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected List<k> f40955a = new ArrayList();

        protected l() {
        }

        public static /* synthetic */ void a(l lVar, v1 v1Var, es.u uVar, k kVar, View view) {
            lVar.getClass();
            if (v1Var.c0(29)) {
                v1Var.H0(v1Var.s().A().G(new qs.w(uVar, com.google.common.collect.x.s(Integer.valueOf(kVar.f40953b)))).J(kVar.f40952a.d(), false).A());
                lVar.f(kVar.f40954c);
                g.this.f40906k.dismiss();
            }
        }

        protected void b() {
            this.f40955a = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c */
        public void onBindViewHolder(i iVar, int i11) {
            final v1 v1Var = g.this.f40901h0;
            if (v1Var == null) {
                return;
            }
            if (i11 == 0) {
                d(iVar);
                return;
            }
            final k kVar = this.f40955a.get(i11 - 1);
            final es.u uVarB = kVar.f40952a.b();
            boolean z11 = v1Var.s().f106116y.get(uVarB) != null && kVar.a();
            iVar.f40949a.setText(kVar.f40954c);
            iVar.f40950b.setVisibility(z11 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g.l.a(this.f40962a, v1Var, uVarB, kVar, view);
                }
            });
        }

        protected abstract void d(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new i(LayoutInflater.from(g.this.getContext()).inflate(rs.m.f109137e, viewGroup, false));
        }

        protected abstract void f(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f40955a.isEmpty()) {
                return 0;
            }
            return this.f40955a.size() + 1;
        }
    }

    @Deprecated
    public interface m {
        void n(int i11);
    }

    static {
        br.p.a("goog.exo.ui");
        f40885x0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public g(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0() {
        ImageView imageView;
        if (d0() && this.f40907k0 && (imageView = this.f40926u) != null) {
            v1 v1Var = this.f40901h0;
            if (!this.f40886a.A(imageView)) {
                o0(false, this.f40926u);
                return;
            }
            if (v1Var == null || !v1Var.c0(14)) {
                o0(false, this.f40926u);
                this.f40926u.setImageDrawable(this.R);
                this.f40926u.setContentDescription(this.V);
            } else {
                o0(true, this.f40926u);
                this.f40926u.setImageDrawable(v1Var.T() ? this.Q : this.R);
                this.f40926u.setContentDescription(v1Var.T() ? this.U : this.V);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public void B0() {
        int i11;
        long jD0;
        f2.d dVar;
        long j11;
        v1 v1Var = this.f40901h0;
        if (v1Var == null) {
            return;
        }
        boolean z11 = true;
        this.f40911m0 = this.f40909l0 && S(v1Var, this.I);
        long j12 = 0;
        this.f40929v0 = 0L;
        f2 f2VarJ = v1Var.c0(17) ? v1Var.J() : f2.f39911a;
        long j13 = -9223372036854775807L;
        if (!f2VarJ.u()) {
            int iR = v1Var.R();
            boolean z12 = this.f40911m0;
            int i12 = z12 ? 0 : iR;
            int iT = z12 ? f2VarJ.t() - 1 : iR;
            i11 = 0;
            long j14 = 0;
            while (i12 <= iT) {
                if (i12 == iR) {
                    this.f40929v0 = p0.Z0(j14);
                }
                f2VarJ.r(i12, this.I);
                f2.d dVar2 = this.I;
                boolean z13 = z11;
                long j15 = j12;
                if (dVar2.f39955n == j13) {
                    ts.a.g(this.f40911m0 ^ z13);
                    break;
                }
                int i13 = dVar2.f39956o;
                while (true) {
                    dVar = this.I;
                    if (i13 <= dVar.f39957p) {
                        f2VarJ.j(i13, this.H);
                        int iR2 = this.H.r();
                        int iF = this.H.f();
                        while (iR2 < iF) {
                            long jI = this.H.i(iR2);
                            if (jI == Long.MIN_VALUE) {
                                j11 = j13;
                                long j16 = this.H.f39925d;
                                if (j16 != j11) {
                                    jI = j16;
                                }
                                iR2++;
                                j13 = j11;
                            } else {
                                j11 = j13;
                            }
                            long jQ = jI + this.H.q();
                            if (jQ >= j15) {
                                long[] jArr = this.f40921r0;
                                if (i11 == jArr.length) {
                                    ?? length = jArr.length == 0 ? z13 : jArr.length * 2;
                                    this.f40921r0 = Arrays.copyOf(jArr, (int) length);
                                    this.f40923s0 = Arrays.copyOf(this.f40923s0, (int) length);
                                }
                                this.f40921r0[i11] = p0.Z0(j14 + jQ);
                                this.f40923s0[i11] = this.H.s(iR2);
                                i11++;
                            }
                            iR2++;
                            j13 = j11;
                        }
                        i13++;
                    }
                }
                j14 += dVar.f39955n;
                i12++;
                z11 = z13;
                j12 = j15;
            }
            jD0 = j14;
        } else if (v1Var.c0(16)) {
            long jW = v1Var.w();
            if (jW != -9223372036854775807L) {
                jD0 = p0.D0(jW);
                i11 = 0;
            } else {
                i11 = 0;
                jD0 = 0;
            }
        } else {
            i11 = 0;
            jD0 = 0;
        }
        long jZ0 = p0.Z0(jD0);
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(p0.f0(this.F, this.G, jZ0));
        }
        e0 e0Var = this.E;
        if (e0Var != null) {
            e0Var.setDuration(jZ0);
            int length2 = this.f40925t0.length;
            int i14 = i11 + length2;
            long[] jArr2 = this.f40921r0;
            if (i14 > jArr2.length) {
                this.f40921r0 = Arrays.copyOf(jArr2, i14);
                this.f40923s0 = Arrays.copyOf(this.f40923s0, i14);
            }
            System.arraycopy(this.f40925t0, 0, this.f40921r0, i11, length2);
            System.arraycopy(this.f40927u0, 0, this.f40923s0, i11, length2);
            this.E.setAdGroupTimesMs(this.f40921r0, this.f40923s0, i14);
        }
        v0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        Z();
        o0(this.f40900h.getItemCount() > 0, this.f40930w);
        y0();
    }

    private static boolean S(v1 v1Var, f2.d dVar) {
        f2 f2VarJ;
        int iT;
        if (!v1Var.c0(17) || (iT = (f2VarJ = v1Var.J()).t()) <= 1 || iT > 100) {
            return false;
        }
        for (int i11 = 0; i11 < iT; i11++) {
            if (f2VarJ.r(i11, dVar).f39955n == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(RecyclerView.h<?> hVar, View view) {
        this.f40894e.setAdapter(hVar);
        z0();
        this.f40931w0 = false;
        this.f40906k.dismiss();
        this.f40931w0 = true;
        this.f40906k.showAsDropDown(view, (getWidth() - this.f40906k.getWidth()) - this.f40908l, (-this.f40906k.getHeight()) - this.f40908l);
    }

    private com.google.common.collect.x<k> V(g2 g2Var, int i11) {
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        com.google.common.collect.x<g2.a> xVarB = g2Var.b();
        for (int i12 = 0; i12 < xVarB.size(); i12++) {
            g2.a aVar2 = xVarB.get(i12);
            if (aVar2.d() == i11) {
                for (int i13 = 0; i13 < aVar2.f39971a; i13++) {
                    if (aVar2.h(i13)) {
                        u0 u0VarC = aVar2.c(i13);
                        if ((u0VarC.f40704d & 2) == 0) {
                            aVar.a(new k(g2Var, i12, i13, this.f40904j.a(u0VarC)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private static int W(TypedArray typedArray, int i11) {
        return typedArray.getInt(rs.q.D, i11);
    }

    private void Z() {
        this.f40900h.b();
        this.f40902i.b();
        v1 v1Var = this.f40901h0;
        if (v1Var != null && v1Var.c0(30) && this.f40901h0.c0(29)) {
            g2 g2VarP = this.f40901h0.p();
            this.f40902i.i(V(g2VarP, 1));
            if (this.f40886a.A(this.f40930w)) {
                this.f40900h.h(V(g2VarP, 3));
            } else {
                this.f40900h.h(com.google.common.collect.x.r());
            }
        }
    }

    private static void a0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean c0(int i11) {
        return i11 == 90 || i11 == 89 || i11 == 85 || i11 == 79 || i11 == 126 || i11 == 127 || i11 == 87 || i11 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(View view) {
        if (this.f40903i0 == null) {
            return;
        }
        boolean z11 = !this.f40905j0;
        this.f40905j0 = z11;
        q0(this.f40932x, z11);
        q0(this.f40933y, this.f40905j0);
        d dVar = this.f40903i0;
        if (dVar != null) {
            dVar.q(this.f40905j0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i14 - i12;
        int i21 = i18 - i16;
        if (!(i13 - i11 == i17 - i15 && i19 == i21) && this.f40906k.isShowing()) {
            z0();
            this.f40906k.update(view, (getWidth() - this.f40906k.getWidth()) - this.f40908l, (-this.f40906k.getHeight()) - this.f40908l, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(int i11) {
        if (i11 == 0) {
            U(this.f40898g, (View) ts.a.e(this.f40934z));
        } else if (i11 == 1) {
            U(this.f40902i, (View) ts.a.e(this.f40934z));
        } else {
            this.f40906k.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(v1 v1Var, long j11) {
        if (this.f40911m0) {
            if (v1Var.c0(17) && v1Var.c0(10)) {
                f2 f2VarJ = v1Var.J();
                int iT = f2VarJ.t();
                int i11 = 0;
                while (true) {
                    long jF = f2VarJ.r(i11, this.I).f();
                    if (j11 < jF) {
                        break;
                    }
                    if (i11 == iT - 1) {
                        j11 = jF;
                        break;
                    } else {
                        j11 -= jF;
                        i11++;
                    }
                }
                v1Var.M(i11, j11);
            }
        } else if (v1Var.c0(5)) {
            v1Var.seekTo(j11);
        }
        v0();
    }

    private boolean l0() {
        v1 v1Var = this.f40901h0;
        if (v1Var == null || !v1Var.c0(1)) {
            return false;
        }
        return (this.f40901h0.c0(17) && this.f40901h0.J().u()) ? false : true;
    }

    private void o0(boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.S : this.T);
    }

    private void p0() {
        v1 v1Var = this.f40901h0;
        int iA = (int) ((v1Var != null ? v1Var.A() : 15000L) / 1000);
        TextView textView = this.f40920r;
        if (textView != null) {
            textView.setText(String.valueOf(iA));
        }
        View view = this.f40916p;
        if (view != null) {
            view.setContentDescription(this.f40888b.getQuantityString(rs.n.f109138a, iA, Integer.valueOf(iA)));
        }
    }

    private void q0(ImageView imageView, boolean z11) {
        if (imageView == null) {
            return;
        }
        if (z11) {
            imageView.setImageDrawable(this.f40893d0);
            imageView.setContentDescription(this.f40897f0);
        } else {
            imageView.setImageDrawable(this.f40895e0);
            imageView.setContentDescription(this.f40899g0);
        }
    }

    private static void r0(View view, boolean z11) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0() {
        boolean zC0;
        boolean zC1;
        boolean zC2;
        boolean zC3;
        boolean zC4;
        if (d0() && this.f40907k0) {
            v1 v1Var = this.f40901h0;
            if (v1Var != null) {
                zC0 = (this.f40909l0 && S(v1Var, this.I)) ? v1Var.c0(10) : v1Var.c0(5);
                zC2 = v1Var.c0(7);
                zC3 = v1Var.c0(11);
                zC4 = v1Var.c0(12);
                zC1 = v1Var.c0(9);
            } else {
                zC0 = false;
                zC1 = false;
                zC2 = false;
                zC3 = false;
                zC4 = false;
            }
            if (zC3) {
                x0();
            }
            if (zC4) {
                p0();
            }
            o0(zC2, this.f40910m);
            o0(zC3, this.f40918q);
            o0(zC4, this.f40916p);
            o0(zC1, this.f40912n);
            e0 e0Var = this.E;
            if (e0Var != null) {
                e0Var.setEnabled(zC0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f11) {
        v1 v1Var = this.f40901h0;
        if (v1Var == null || !v1Var.c0(13)) {
            return;
        }
        v1 v1Var2 = this.f40901h0;
        v1Var2.j(v1Var2.e().c(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        if (d0() && this.f40907k0 && this.f40914o != null) {
            boolean zO0 = p0.O0(this.f40901h0);
            int i11 = zO0 ? rs.i.f109095f : rs.i.f109094e;
            int i12 = zO0 ? rs.o.f109146g : rs.o.f109145f;
            ((ImageView) this.f40914o).setImageDrawable(p0.R(getContext(), this.f40888b, i11));
            this.f40914o.setContentDescription(this.f40888b.getString(i12));
            o0(l0(), this.f40914o);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        v1 v1Var = this.f40901h0;
        if (v1Var == null) {
            return;
        }
        this.f40898g.e(v1Var.e().f40757a);
        this.f40896f.d(0, this.f40898g.b());
        y0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        long jQ;
        long jB;
        if (d0() && this.f40907k0) {
            v1 v1Var = this.f40901h0;
            if (v1Var == null || !v1Var.c0(16)) {
                jQ = 0;
                jB = 0;
            } else {
                jQ = this.f40929v0 + v1Var.Q();
                jB = this.f40929v0 + v1Var.B();
            }
            TextView textView = this.D;
            if (textView != null && !this.f40913n0) {
                textView.setText(p0.f0(this.F, this.G, jQ));
            }
            e0 e0Var = this.E;
            if (e0Var != null) {
                e0Var.setPosition(jQ);
                this.E.setBufferedPosition(jB);
            }
            removeCallbacks(this.J);
            int iG = v1Var == null ? 1 : v1Var.g();
            if (v1Var == null || !v1Var.isPlaying()) {
                if (iG == 4 || iG == 1) {
                    return;
                }
                postDelayed(this.J, 1000L);
                return;
            }
            e0 e0Var2 = this.E;
            long jMin = Math.min(e0Var2 != null ? e0Var2.getPreferredUpdateDelay() : 1000L, 1000 - (jQ % 1000));
            float f11 = v1Var.e().f40757a;
            postDelayed(this.J, p0.r(f11 > BitmapDescriptorFactory.HUE_RED ? (long) (jMin / f11) : 1000L, this.f40917p0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        ImageView imageView;
        if (d0() && this.f40907k0 && (imageView = this.f40924t) != null) {
            if (this.f40919q0 == 0) {
                o0(false, imageView);
                return;
            }
            v1 v1Var = this.f40901h0;
            if (v1Var == null || !v1Var.c0(15)) {
                o0(false, this.f40924t);
                this.f40924t.setImageDrawable(this.K);
                this.f40924t.setContentDescription(this.N);
                return;
            }
            o0(true, this.f40924t);
            int iH = v1Var.h();
            if (iH == 0) {
                this.f40924t.setImageDrawable(this.K);
                this.f40924t.setContentDescription(this.N);
            } else if (iH == 1) {
                this.f40924t.setImageDrawable(this.L);
                this.f40924t.setContentDescription(this.O);
            } else {
                if (iH != 2) {
                    return;
                }
                this.f40924t.setImageDrawable(this.M);
                this.f40924t.setContentDescription(this.P);
            }
        }
    }

    private void x0() {
        v1 v1Var = this.f40901h0;
        int iW = (int) ((v1Var != null ? v1Var.W() : DeviceOrientationRequest.OUTPUT_PERIOD_FAST) / 1000);
        TextView textView = this.f40922s;
        if (textView != null) {
            textView.setText(String.valueOf(iW));
        }
        View view = this.f40918q;
        if (view != null) {
            view.setContentDescription(this.f40888b.getQuantityString(rs.n.f109139b, iW, Integer.valueOf(iW)));
        }
    }

    private void y0() {
        o0(this.f40896f.a(), this.f40934z);
    }

    private void z0() {
        this.f40894e.measure(0, 0);
        this.f40906k.setWidth(Math.min(this.f40894e.getMeasuredWidth(), getWidth() - (this.f40908l * 2)));
        this.f40906k.setHeight(Math.min(getHeight() - (this.f40908l * 2), this.f40894e.getMeasuredHeight()));
    }

    @Deprecated
    public void R(m mVar) {
        ts.a.e(mVar);
        this.f40892d.add(mVar);
    }

    public boolean T(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        v1 v1Var = this.f40901h0;
        if (v1Var == null || !c0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (v1Var.g() == 4 || !v1Var.c0(12)) {
                return true;
            }
            v1Var.C();
            return true;
        }
        if (keyCode == 89 && v1Var.c0(11)) {
            v1Var.U();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            p0.o0(v1Var);
            return true;
        }
        if (keyCode == 87) {
            if (!v1Var.c0(9)) {
                return true;
            }
            v1Var.K();
            return true;
        }
        if (keyCode == 88) {
            if (!v1Var.c0(7)) {
                return true;
            }
            v1Var.F();
            return true;
        }
        if (keyCode == 126) {
            p0.n0(v1Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        p0.m0(v1Var);
        return true;
    }

    public void X() {
        this.f40886a.C();
    }

    public void Y() {
        this.f40886a.F();
    }

    public boolean b0() {
        return this.f40886a.I();
    }

    public boolean d0() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return T(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    void e0() {
        Iterator<m> it = this.f40892d.iterator();
        while (it.hasNext()) {
            it.next().n(getVisibility());
        }
    }

    public v1 getPlayer() {
        return this.f40901h0;
    }

    public int getRepeatToggleModes() {
        return this.f40919q0;
    }

    public boolean getShowShuffleButton() {
        return this.f40886a.A(this.f40926u);
    }

    public boolean getShowSubtitleButton() {
        return this.f40886a.A(this.f40930w);
    }

    public int getShowTimeoutMs() {
        return this.f40915o0;
    }

    public boolean getShowVrButton() {
        return this.f40886a.A(this.f40928v);
    }

    @Deprecated
    public void i0(m mVar) {
        this.f40892d.remove(mVar);
    }

    void j0() {
        View view = this.f40914o;
        if (view != null) {
            view.requestFocus();
        }
    }

    public void m0() {
        this.f40886a.X();
    }

    void n0() {
        t0();
        s0();
        w0();
        A0();
        C0();
        u0();
        B0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40886a.K();
        this.f40907k0 = true;
        if (b0()) {
            this.f40886a.S();
        }
        n0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40886a.L();
        this.f40907k0 = false;
        removeCallbacks(this.J);
        this.f40886a.R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f40886a.M(z11, i11, i12, i13, i14);
    }

    public void setAnimationEnabled(boolean z11) {
        this.f40886a.T(z11);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.f40925t0 = new long[0];
            this.f40927u0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) ts.a.e(zArr);
            ts.a.a(jArr.length == zArr2.length);
            this.f40925t0 = jArr;
            this.f40927u0 = zArr2;
        }
        B0();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(d dVar) {
        this.f40903i0 = dVar;
        r0(this.f40932x, dVar != null);
        r0(this.f40933y, dVar != null);
    }

    public void setPlayer(v1 v1Var) {
        ts.a.g(Looper.myLooper() == Looper.getMainLooper());
        ts.a.a(v1Var == null || v1Var.F0() == Looper.getMainLooper());
        v1 v1Var2 = this.f40901h0;
        if (v1Var2 == v1Var) {
            return;
        }
        if (v1Var2 != null) {
            v1Var2.G0(this.f40890c);
        }
        this.f40901h0 = v1Var;
        if (v1Var != null) {
            v1Var.I0(this.f40890c);
        }
        n0();
    }

    public void setProgressUpdateListener(f fVar) {
    }

    public void setRepeatToggleModes(int i11) {
        this.f40919q0 = i11;
        v1 v1Var = this.f40901h0;
        if (v1Var != null && v1Var.c0(15)) {
            int iH = this.f40901h0.h();
            if (i11 == 0 && iH != 0) {
                this.f40901h0.i(0);
            } else if (i11 == 1 && iH == 2) {
                this.f40901h0.i(1);
            } else if (i11 == 2 && iH == 1) {
                this.f40901h0.i(2);
            }
        }
        this.f40886a.U(this.f40924t, i11 != 0);
        w0();
    }

    public void setShowFastForwardButton(boolean z11) {
        this.f40886a.U(this.f40916p, z11);
        s0();
    }

    public void setShowMultiWindowTimeBar(boolean z11) {
        this.f40909l0 = z11;
        B0();
    }

    public void setShowNextButton(boolean z11) {
        this.f40886a.U(this.f40912n, z11);
        s0();
    }

    public void setShowPreviousButton(boolean z11) {
        this.f40886a.U(this.f40910m, z11);
        s0();
    }

    public void setShowRewindButton(boolean z11) {
        this.f40886a.U(this.f40918q, z11);
        s0();
    }

    public void setShowShuffleButton(boolean z11) {
        this.f40886a.U(this.f40926u, z11);
        A0();
    }

    public void setShowSubtitleButton(boolean z11) {
        this.f40886a.U(this.f40930w, z11);
    }

    public void setShowTimeoutMs(int i11) {
        this.f40915o0 = i11;
        if (b0()) {
            this.f40886a.S();
        }
    }

    public void setShowVrButton(boolean z11) {
        this.f40886a.U(this.f40928v, z11);
    }

    public void setTimeBarMinUpdateInterval(int i11) {
        this.f40917p0 = p0.q(i11, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.f40928v;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            o0(onClickListener != null, this.f40928v);
        }
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    public g(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        ImageView imageView;
        TextView textView;
        Context context2;
        boolean z21;
        super(context, attributeSet, i11);
        int resourceId = rs.m.f109133a;
        this.f40915o0 = 5000;
        this.f40919q0 = 0;
        this.f40917p0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, rs.q.A, i11, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(rs.q.C, resourceId);
                this.f40915o0 = typedArrayObtainStyledAttributes.getInt(rs.q.K, this.f40915o0);
                this.f40919q0 = W(typedArrayObtainStyledAttributes, this.f40919q0);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(rs.q.H, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(rs.q.E, true);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(rs.q.G, true);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(rs.q.F, true);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(rs.q.I, false);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(rs.q.J, false);
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(rs.q.L, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(rs.q.M, this.f40917p0));
                boolean z29 = typedArrayObtainStyledAttributes.getBoolean(rs.q.B, true);
                typedArrayObtainStyledAttributes.recycle();
                z12 = z26;
                z13 = z27;
                z11 = z28;
                z15 = z22;
                z16 = z23;
                z17 = z24;
                z14 = z29;
                z18 = z25;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z11 = false;
            z12 = false;
            z13 = false;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = true;
            z18 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        c cVar = new c();
        this.f40890c = cVar;
        this.f40892d = new CopyOnWriteArrayList<>();
        this.H = new f2.b();
        this.I = new f2.d();
        StringBuilder sb2 = new StringBuilder();
        this.F = sb2;
        this.G = new Formatter(sb2, Locale.getDefault());
        this.f40921r0 = new long[0];
        this.f40923s0 = new boolean[0];
        this.f40925t0 = new long[0];
        this.f40927u0 = new boolean[0];
        this.J = new Runnable() { // from class: rs.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f109195a.v0();
            }
        };
        this.C = (TextView) findViewById(rs.k.f109117m);
        this.D = (TextView) findViewById(rs.k.D);
        ImageView imageView2 = (ImageView) findViewById(rs.k.O);
        this.f40930w = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(cVar);
        }
        ImageView imageView3 = (ImageView) findViewById(rs.k.f109123s);
        this.f40932x = imageView3;
        a0(imageView3, new View.OnClickListener() { // from class: rs.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109196a.f0(view);
            }
        });
        ImageView imageView4 = (ImageView) findViewById(rs.k.f109127w);
        this.f40933y = imageView4;
        a0(imageView4, new View.OnClickListener() { // from class: rs.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109196a.f0(view);
            }
        });
        View viewFindViewById = findViewById(rs.k.K);
        this.f40934z = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar);
        }
        View viewFindViewById2 = findViewById(rs.k.C);
        this.A = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar);
        }
        View viewFindViewById3 = findViewById(rs.k.f109107c);
        this.B = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar);
        }
        e0 e0Var = (e0) findViewById(rs.k.F);
        View viewFindViewById4 = findViewById(rs.k.G);
        if (e0Var != null) {
            this.E = e0Var;
            z19 = z11;
            imageView = imageView2;
            textView = null;
            context2 = context;
        } else if (viewFindViewById4 != null) {
            z19 = z11;
            imageView = imageView2;
            textView = null;
            context2 = context;
            com.google.android.exoplayer2.ui.b bVar = new com.google.android.exoplayer2.ui.b(context2, null, 0, attributeSet2, rs.p.f109166a);
            bVar.setId(rs.k.F);
            bVar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(bVar, iIndexOfChild);
            this.E = bVar;
        } else {
            z19 = z11;
            imageView = imageView2;
            textView = null;
            context2 = context;
            this.E = null;
        }
        e0 e0Var2 = this.E;
        if (e0Var2 != null) {
            e0Var2.a(cVar);
        }
        View viewFindViewById5 = findViewById(rs.k.B);
        this.f40914o = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(cVar);
        }
        View viewFindViewById6 = findViewById(rs.k.E);
        this.f40910m = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(cVar);
        }
        View viewFindViewById7 = findViewById(rs.k.f109128x);
        this.f40912n = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(cVar);
        }
        Typeface typefaceH = j5.h.h(context2, rs.j.f109104a);
        View viewFindViewById8 = findViewById(rs.k.I);
        TextView textView2 = viewFindViewById8 == null ? (TextView) findViewById(rs.k.J) : textView;
        this.f40922s = textView2;
        if (textView2 != null) {
            textView2.setTypeface(typefaceH);
        }
        viewFindViewById8 = viewFindViewById8 == null ? textView2 : viewFindViewById8;
        this.f40918q = viewFindViewById8;
        if (viewFindViewById8 != null) {
            viewFindViewById8.setOnClickListener(cVar);
        }
        View viewFindViewById9 = findViewById(rs.k.f109121q);
        TextView textView3 = viewFindViewById9 == null ? (TextView) findViewById(rs.k.f109122r) : null;
        this.f40920r = textView3;
        if (textView3 != null) {
            textView3.setTypeface(typefaceH);
        }
        viewFindViewById9 = viewFindViewById9 == null ? textView3 : viewFindViewById9;
        this.f40916p = viewFindViewById9;
        if (viewFindViewById9 != null) {
            viewFindViewById9.setOnClickListener(cVar);
        }
        ImageView imageView5 = (ImageView) findViewById(rs.k.H);
        this.f40924t = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(cVar);
        }
        ImageView imageView6 = (ImageView) findViewById(rs.k.L);
        this.f40926u = imageView6;
        if (imageView6 != null) {
            imageView6.setOnClickListener(cVar);
        }
        Resources resources = context2.getResources();
        this.f40888b = resources;
        this.S = resources.getInteger(rs.l.f109132b) / 100.0f;
        this.T = resources.getInteger(rs.l.f109131a) / 100.0f;
        View viewFindViewById10 = findViewById(rs.k.S);
        this.f40928v = viewFindViewById10;
        boolean z31 = z13;
        if (viewFindViewById10 != null) {
            o0(false, viewFindViewById10);
        }
        z zVar = new z(this);
        this.f40886a = zVar;
        zVar.T(z14);
        boolean z32 = z12;
        h hVar = new h(new String[]{resources.getString(rs.o.f109147h), resources.getString(rs.o.f109164y)}, new Drawable[]{p0.R(context2, resources, rs.i.f109101l), p0.R(context2, resources, rs.i.f109091b)});
        this.f40896f = hVar;
        this.f40908l = resources.getDimensionPixelSize(rs.h.f109086a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(rs.m.f109135c, (ViewGroup) null);
        this.f40894e = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        this.f40906k = popupWindow;
        if (p0.f115040a < 23) {
            z21 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z21 = false;
        }
        popupWindow.setOnDismissListener(cVar);
        this.f40931w0 = true;
        this.f40904j = new rs.e(getResources());
        this.W = p0.R(context2, resources, rs.i.f109103n);
        this.f40887a0 = p0.R(context2, resources, rs.i.f109102m);
        this.f40889b0 = resources.getString(rs.o.f109141b);
        this.f40891c0 = resources.getString(rs.o.f109140a);
        this.f40900h = new j();
        this.f40902i = new b();
        this.f40898g = new e(resources.getStringArray(rs.f.f109084a), f40885x0);
        this.f40893d0 = p0.R(context2, resources, rs.i.f109093d);
        this.f40895e0 = p0.R(context2, resources, rs.i.f109092c);
        this.K = p0.R(context2, resources, rs.i.f109097h);
        this.L = p0.R(context2, resources, rs.i.f109098i);
        this.M = p0.R(context2, resources, rs.i.f109096g);
        this.Q = p0.R(context2, resources, rs.i.f109100k);
        this.R = p0.R(context2, resources, rs.i.f109099j);
        this.f40897f0 = resources.getString(rs.o.f109143d);
        this.f40899g0 = resources.getString(rs.o.f109142c);
        this.N = resources.getString(rs.o.f109149j);
        this.O = resources.getString(rs.o.f109150k);
        this.P = resources.getString(rs.o.f109148i);
        this.U = resources.getString(rs.o.f109153n);
        this.V = resources.getString(rs.o.f109152m);
        zVar.U((ViewGroup) findViewById(rs.k.f109109e), true);
        zVar.U(viewFindViewById9, z16);
        zVar.U(viewFindViewById8, z15);
        zVar.U(viewFindViewById6, z17);
        zVar.U(viewFindViewById7, z18);
        zVar.U(imageView6, z32);
        zVar.U(imageView, z31);
        zVar.U(viewFindViewById10, z19);
        zVar.U(imageView5, this.f40919q0 != 0 ? true : z21);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: rs.t
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                this.f109197a.g0(view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
    }
}
