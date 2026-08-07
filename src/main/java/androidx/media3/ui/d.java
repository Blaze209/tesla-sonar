package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import androidx.media3.exoplayer.ExoPlayer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p7.a1;
import p7.j0;
import p7.r0;
import p7.t0;
import p7.u0;
import p7.w0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends FrameLayout {
    private static final float[] H0;
    private final ImageView A;
    private int A0;
    private final ImageView B;
    private long[] B0;
    private final ImageView C;
    private boolean[] C0;
    private final ImageView D;
    private long[] D0;
    private final ImageView E;
    private boolean[] E0;
    private final View F;
    private long F0;
    private final View G;
    private boolean G0;
    private final View H;
    private final TextView I;
    private final TextView J;
    private final g0 K;
    private final StringBuilder L;
    private final Formatter M;
    private final r0.b N;
    private final r0.d O;
    private final Runnable P;
    private final Drawable Q;
    private final Drawable R;
    private final Drawable S;
    private final Drawable T;
    private final Drawable U;
    private final String V;
    private final String W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f12840a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final String f12841a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f12842b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final Drawable f12843b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f12844c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final Drawable f12845c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class<?> f12846d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final float f12847d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f12848e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final float f12849e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Method f12850f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final String f12851f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class<?> f12852g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final String f12853g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Method f12854h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final Drawable f12855h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Method f12856i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final Drawable f12857i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f12858j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private final String f12859j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final RecyclerView f12860k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private final String f12861k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final h f12862l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final Drawable f12863l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e f12864m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final Drawable f12865m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f12866n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final String f12867n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final b f12868o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final String f12869o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ia.a0 f12870p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private j0 f12871p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final PopupWindow f12872q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private InterfaceC0213d f12873q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f12874r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private boolean f12875r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ImageView f12876s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f12877s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ImageView f12878t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f12879t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ImageView f12880u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private boolean f12881u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final View f12882v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f12883v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final View f12884w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private boolean f12885w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final TextView f12886x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private int f12887x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final TextView f12888y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private boolean f12889y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final ImageView f12890z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private int f12891z0;

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends l {
        private b() {
            super();
        }

        public static /* synthetic */ void g(b bVar, View view) {
            if (d.this.f12871p0 == null || !d.this.f12871p0.c0(29)) {
                return;
            }
            ((j0) q0.l(d.this.f12871p0)).C0(d.this.f12871p0.s().I().I(1).W(1, false).G());
            d.this.f12862l.d(1, d.this.getResources().getString(ia.x.f77289w));
            d.this.f12872q.dismiss();
        }

        private boolean h(w0 w0Var) {
            for (int i11 = 0; i11 < this.f12912a.size(); i11++) {
                if (w0Var.D.containsKey(this.f12912a.get(i11).f12909a.c())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.ui.d.l
        public void d(i iVar) {
            iVar.f12906a.setText(ia.x.f77289w);
            iVar.f12907b.setVisibility(h(((j0) s7.a.f(d.this.f12871p0)).s()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.b.g(this.f12914a, view);
                }
            });
        }

        @Override // androidx.media3.ui.d.l
        public void f(String str) {
            d.this.f12862l.d(1, str);
        }

        public void i(List<k> list) {
            this.f12912a = list;
            w0 w0VarS = ((j0) s7.a.f(d.this.f12871p0)).s();
            if (list.isEmpty()) {
                d.this.f12862l.d(1, d.this.getResources().getString(ia.x.f77290x));
                return;
            }
            if (!h(w0VarS)) {
                d.this.f12862l.d(1, d.this.getResources().getString(ia.x.f77289w));
                return;
            }
            for (int i11 = 0; i11 < list.size(); i11++) {
                k kVar = list.get(i11);
                if (kVar.a()) {
                    d.this.f12862l.d(1, kVar.f12911c);
                    return;
                }
            }
        }
    }

    private final class c implements j0.d, g0.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // p7.j0.d
        public void V(j0 j0Var, j0.c cVar) {
            if (cVar.b(4, 5, 13)) {
                d.this.D0();
            }
            if (cVar.b(4, 5, 7, 13)) {
                d.this.F0();
            }
            if (cVar.b(8, 13)) {
                d.this.G0();
            }
            if (cVar.b(9, 13)) {
                d.this.K0();
            }
            if (cVar.b(8, 9, 11, 0, 16, 17, 13)) {
                d.this.C0();
            }
            if (cVar.b(11, 0, 13)) {
                d.this.L0();
            }
            if (cVar.b(12, 13)) {
                d.this.E0();
            }
            if (cVar.b(2, 13)) {
                d.this.M0();
            }
        }

        @Override // androidx.media3.ui.g0.a
        public void n(g0 g0Var, long j11) {
            d.this.f12885w0 = true;
            if (d.this.J != null) {
                d.this.J.setText(q0.x0(d.this.L, d.this.M, j11));
            }
            d.this.f12840a.R();
            if (d.this.f12871p0 == null || !d.this.f12889y0) {
                return;
            }
            d dVar = d.this;
            if (dVar.j0(dVar.f12871p0)) {
                try {
                    ((Method) s7.a.f(d.this.f12848e)).invoke(d.this.f12871p0, Boolean.TRUE);
                    return;
                } catch (IllegalAccessException | InvocationTargetException e11) {
                    throw new RuntimeException(e11);
                }
            }
            d dVar2 = d.this;
            if (dVar2.i0(dVar2.f12871p0)) {
                try {
                    ((Method) s7.a.f(d.this.f12854h)).invoke(d.this.f12871p0, Boolean.TRUE);
                } catch (IllegalAccessException | InvocationTargetException e12) {
                    throw new RuntimeException(e12);
                }
            } else {
                s7.t.i("PlayerControlView", "Time bar scrubbing is enabled, but player is not an ExoPlayer or CompositionPlayer instance, so ignoring (because we can't enable scrubbing mode). player.class=" + ((j0) s7.a.f(d.this.f12871p0)).getClass());
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j0 j0Var = d.this.f12871p0;
            if (j0Var == null) {
                return;
            }
            d.this.f12840a.S();
            if (d.this.f12878t == view) {
                if (j0Var.c0(9)) {
                    j0Var.K();
                    return;
                }
                return;
            }
            if (d.this.f12876s == view) {
                if (j0Var.c0(7)) {
                    j0Var.F();
                    return;
                }
                return;
            }
            if (d.this.f12882v == view) {
                if (j0Var.g() == 4 || !j0Var.c0(12)) {
                    return;
                }
                j0Var.C();
                return;
            }
            if (d.this.f12884w == view) {
                if (j0Var.c0(11)) {
                    j0Var.U();
                    return;
                }
                return;
            }
            if (d.this.f12880u == view) {
                q0.H0(j0Var, d.this.f12881u0);
                return;
            }
            if (d.this.f12890z == view) {
                if (j0Var.c0(15)) {
                    j0Var.i(s7.d0.a(j0Var.h(), d.this.A0));
                    return;
                }
                return;
            }
            if (d.this.A == view) {
                if (j0Var.c0(14)) {
                    j0Var.u(!j0Var.T());
                    return;
                }
                return;
            }
            if (d.this.F == view) {
                d.this.f12840a.R();
                d dVar = d.this;
                dVar.b0(dVar.f12862l, d.this.F);
                return;
            }
            if (d.this.G == view) {
                d.this.f12840a.R();
                d dVar2 = d.this;
                dVar2.b0(dVar2.f12864m, d.this.G);
            } else if (d.this.H == view) {
                d.this.f12840a.R();
                d dVar3 = d.this;
                dVar3.b0(dVar3.f12868o, d.this.H);
            } else if (d.this.C == view) {
                d.this.f12840a.R();
                d dVar4 = d.this;
                dVar4.b0(dVar4.f12866n, d.this.C);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (d.this.G0) {
                d.this.f12840a.S();
            }
        }

        @Override // androidx.media3.ui.g0.a
        public void q(g0 g0Var, long j11) {
            if (d.this.J != null) {
                d.this.J.setText(q0.x0(d.this.L, d.this.M, j11));
            }
            d dVar = d.this;
            if (dVar.m0(dVar.f12871p0)) {
                d dVar2 = d.this;
                dVar2.u0(dVar2.f12871p0, j11);
            }
        }

        @Override // androidx.media3.ui.g0.a
        public void z(g0 g0Var, long j11, boolean z11) {
            d.this.f12885w0 = false;
            if (d.this.f12871p0 != null) {
                if (!z11) {
                    d dVar = d.this;
                    dVar.u0(dVar.f12871p0, j11);
                }
                d dVar2 = d.this;
                if (dVar2.j0(dVar2.f12871p0)) {
                    try {
                        ((Method) s7.a.f(d.this.f12848e)).invoke(d.this.f12871p0, Boolean.FALSE);
                    } catch (IllegalAccessException | InvocationTargetException e11) {
                        throw new RuntimeException(e11);
                    }
                } else {
                    d dVar3 = d.this;
                    if (dVar3.i0(dVar3.f12871p0)) {
                        try {
                            ((Method) s7.a.f(d.this.f12854h)).invoke(d.this.f12871p0, Boolean.FALSE);
                        } catch (IllegalAccessException | InvocationTargetException e12) {
                            throw new RuntimeException(e12);
                        }
                    }
                }
            }
            d.this.f12840a.S();
        }
    }

    /* JADX INFO: renamed from: androidx.media3.ui.d$d, reason: collision with other inner class name */
    @Deprecated
    public interface InterfaceC0213d {
        void q(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class e extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f12894a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float[] f12895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12896c;

        public e(String[] strArr, float[] fArr) {
            this.f12894a = strArr;
            this.f12895b = fArr;
        }

        public static /* synthetic */ void a(e eVar, int i11, View view) {
            if (i11 != eVar.f12896c) {
                d.this.setPlaybackSpeed(eVar.f12895b[i11]);
            }
            d.this.f12872q.dismiss();
        }

        public String b() {
            return this.f12894a[this.f12896c];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, final int i11) {
            String[] strArr = this.f12894a;
            if (i11 < strArr.length) {
                iVar.f12906a.setText(strArr[i11]);
            }
            if (i11 == this.f12896c) {
                iVar.itemView.setSelected(true);
                iVar.f12907b.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f12907b.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.e.a(this.f12915a, i11, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new i(LayoutInflater.from(d.this.getContext()).inflate(ia.v.f77264g, viewGroup, false));
        }

        public void e(float f11) {
            int i11 = 0;
            float f12 = Float.MAX_VALUE;
            int i12 = 0;
            while (true) {
                float[] fArr = this.f12895b;
                if (i11 >= fArr.length) {
                    this.f12896c = i12;
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
            return this.f12894a.length;
        }
    }

    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class g extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TextView f12898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f12899b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImageView f12900c;

        public g(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.f12898a = (TextView) view.findViewById(ia.t.f77251v);
            this.f12899b = (TextView) view.findViewById(ia.t.Q);
            this.f12900c = (ImageView) view.findViewById(ia.t.f77249t);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    d.g gVar = this.f12917a;
                    d.this.r0(gVar.getBindingAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class h extends RecyclerView.h<g> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f12902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String[] f12903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Drawable[] f12904c;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f12902a = strArr;
            this.f12903b = new String[strArr.length];
            this.f12904c = drawableArr;
        }

        private boolean e(int i11) {
            if (d.this.f12871p0 == null) {
                return false;
            }
            if (i11 == 0) {
                return d.this.f12871p0.c0(13);
            }
            if (i11 != 1) {
                return true;
            }
            return d.this.f12871p0.c0(30) && d.this.f12871p0.c0(29);
        }

        public boolean a() {
            return e(1) || e(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(g gVar, int i11) {
            if (e(i11)) {
                gVar.itemView.setLayoutParams(new RecyclerView.r(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.r(0, 0));
            }
            gVar.f12898a.setText(this.f12902a[i11]);
            if (this.f12903b[i11] == null) {
                gVar.f12899b.setVisibility(8);
            } else {
                gVar.f12899b.setText(this.f12903b[i11]);
            }
            if (this.f12904c[i11] == null) {
                gVar.f12900c.setVisibility(8);
            } else {
                gVar.f12900c.setImageDrawable(this.f12904c[i11]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public g onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return d.this.new g(LayoutInflater.from(d.this.getContext()).inflate(ia.v.f77263f, viewGroup, false));
        }

        public void d(int i11, String str) {
            this.f12903b[i11] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f12902a.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i11) {
            return i11;
        }
    }

    private static class i extends RecyclerView.g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f12906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f12907b;

        public i(View view) {
            super(view);
            if (Build.VERSION.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.f12906a = (TextView) view.findViewById(ia.t.T);
            this.f12907b = view.findViewById(ia.t.f77237h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class j extends l {
        private j() {
            super();
        }

        public static /* synthetic */ void g(j jVar, View view) {
            if (d.this.f12871p0 == null || !d.this.f12871p0.c0(29)) {
                return;
            }
            d.this.f12871p0.C0(d.this.f12871p0.s().I().I(3).Q(-3).T(null).V(0).G());
            d.this.f12872q.dismiss();
        }

        @Override // androidx.media3.ui.d.l, androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(i iVar, int i11) {
            super.onBindViewHolder(iVar, i11);
            if (i11 > 0) {
                iVar.f12907b.setVisibility(this.f12912a.get(i11 + (-1)).a() ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.d.l
        public void d(i iVar) {
            boolean z11;
            iVar.f12906a.setText(ia.x.f77290x);
            int i11 = 0;
            while (true) {
                if (i11 >= this.f12912a.size()) {
                    z11 = true;
                    break;
                } else {
                    if (this.f12912a.get(i11).a()) {
                        z11 = false;
                        break;
                    }
                    i11++;
                }
            }
            iVar.f12907b.setVisibility(z11 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.j.g(this.f12918a, view);
                }
            });
        }

        @Override // androidx.media3.ui.d.l
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
            if (d.this.C != null) {
                ImageView imageView = d.this.C;
                d dVar = d.this;
                imageView.setImageDrawable(z11 ? dVar.f12855h0 : dVar.f12857i0);
                d.this.C.setContentDescription(z11 ? d.this.f12859j0 : d.this.f12861k0);
            }
            this.f12912a = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a1.a f12909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f12910b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f12911c;

        public k(a1 a1Var, int i11, int i12, String str) {
            this.f12909a = a1Var.b().get(i11);
            this.f12910b = i12;
            this.f12911c = str;
        }

        public boolean a() {
            return this.f12909a.j(this.f12910b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class l extends RecyclerView.h<i> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected List<k> f12912a = new ArrayList();

        protected l() {
        }

        public static /* synthetic */ void a(l lVar, j0 j0Var, t0 t0Var, k kVar, View view) {
            lVar.getClass();
            if (j0Var.c0(29)) {
                j0Var.C0(j0Var.s().I().S(new u0(t0Var, com.google.common.collect.x.s(Integer.valueOf(kVar.f12910b)))).W(kVar.f12909a.f(), false).G());
                lVar.f(kVar.f12911c);
                d.this.f12872q.dismiss();
            }
        }

        protected void b() {
            this.f12912a = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: c */
        public void onBindViewHolder(i iVar, int i11) {
            final j0 j0Var = d.this.f12871p0;
            if (j0Var == null) {
                return;
            }
            if (i11 == 0) {
                d(iVar);
                return;
            }
            final k kVar = this.f12912a.get(i11 - 1);
            final t0 t0VarC = kVar.f12909a.c();
            boolean z11 = j0Var.s().D.get(t0VarC) != null && kVar.a();
            iVar.f12906a.setText(kVar.f12911c);
            iVar.f12907b.setVisibility(z11 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    d.l.a(this.f12928a, j0Var, t0VarC, kVar, view);
                }
            });
        }

        protected abstract void d(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public i onCreateViewHolder(ViewGroup viewGroup, int i11) {
            return new i(LayoutInflater.from(d.this.getContext()).inflate(ia.v.f77264g, viewGroup, false));
        }

        protected abstract void f(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            if (this.f12912a.isEmpty()) {
                return 0;
            }
            return this.f12912a.size() + 1;
        }
    }

    @Deprecated
    public interface m {
        void n(int i11);
    }

    static {
        p7.d0.a("media3.ui");
        H0 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public d(Context context) {
        this(context, null);
    }

    private static void A0(View view, boolean z11) {
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
    public void C0() {
        boolean zC0;
        boolean zC1;
        boolean zC2;
        boolean zC3;
        boolean zC4;
        if (n0() && this.f12877s0) {
            j0 j0Var = this.f12871p0;
            if (j0Var != null) {
                zC0 = (this.f12879t0 && Z(j0Var, this.O)) ? j0Var.c0(10) : j0Var.c0(5);
                zC2 = j0Var.c0(7);
                zC3 = j0Var.c0(11);
                zC4 = j0Var.c0(12);
                zC1 = j0Var.c0(9);
            } else {
                zC0 = false;
                zC1 = false;
                zC2 = false;
                zC3 = false;
                zC4 = false;
            }
            if (zC3) {
                H0();
            }
            if (zC4) {
                y0();
            }
            x0(zC2, this.f12876s);
            x0(zC3, this.f12884w);
            x0(zC4, this.f12882v);
            x0(zC1, this.f12878t);
            g0 g0Var = this.K;
            if (g0Var != null) {
                g0Var.setEnabled(zC0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0() {
        if (n0() && this.f12877s0 && this.f12880u != null) {
            boolean zB1 = q0.B1(this.f12871p0, this.f12881u0);
            Drawable drawable = zB1 ? this.Q : this.R;
            int i11 = zB1 ? ia.x.f77273g : ia.x.f77272f;
            this.f12880u.setImageDrawable(drawable);
            this.f12880u.setContentDescription(this.f12842b.getString(i11));
            x0(q0.A1(this.f12871p0), this.f12880u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        j0 j0Var = this.f12871p0;
        if (j0Var == null) {
            return;
        }
        this.f12864m.e(j0Var.e().f101379a);
        this.f12862l.d(0, this.f12864m.b());
        I0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        long jQ;
        long jB;
        if (n0() && this.f12877s0) {
            j0 j0Var = this.f12871p0;
            if (j0Var == null || !j0Var.c0(16)) {
                jQ = 0;
                jB = 0;
            } else {
                jQ = this.F0 + j0Var.Q();
                jB = this.F0 + j0Var.B();
            }
            TextView textView = this.J;
            if (textView != null && !this.f12885w0) {
                textView.setText(q0.x0(this.L, this.M, jQ));
            }
            g0 g0Var = this.K;
            if (g0Var != null) {
                g0Var.setPosition(jQ);
                g0 g0Var2 = this.K;
                if (m0(j0Var)) {
                    jB = jQ;
                }
                g0Var2.setBufferedPosition(jB);
            }
            removeCallbacks(this.P);
            int iG = j0Var == null ? 1 : j0Var.g();
            if (j0Var == null || !j0Var.isPlaying()) {
                if (iG == 4 || iG == 1) {
                    return;
                }
                postDelayed(this.P, 1000L);
                return;
            }
            g0 g0Var3 = this.K;
            long jMin = Math.min(g0Var3 != null ? g0Var3.getPreferredUpdateDelay() : 1000L, 1000 - (jQ % 1000));
            float f11 = j0Var.e().f101379a;
            postDelayed(this.P, q0.s(f11 > BitmapDescriptorFactory.HUE_RED ? (long) (jMin / f11) : 1000L, this.f12891z0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G0() {
        ImageView imageView;
        if (n0() && this.f12877s0 && (imageView = this.f12890z) != null) {
            if (this.A0 == 0) {
                x0(false, imageView);
                return;
            }
            j0 j0Var = this.f12871p0;
            if (j0Var == null || !j0Var.c0(15)) {
                x0(false, this.f12890z);
                this.f12890z.setImageDrawable(this.S);
                this.f12890z.setContentDescription(this.V);
                return;
            }
            x0(true, this.f12890z);
            int iH = j0Var.h();
            if (iH == 0) {
                this.f12890z.setImageDrawable(this.S);
                this.f12890z.setContentDescription(this.V);
            } else if (iH == 1) {
                this.f12890z.setImageDrawable(this.T);
                this.f12890z.setContentDescription(this.W);
            } else {
                if (iH != 2) {
                    return;
                }
                this.f12890z.setImageDrawable(this.U);
                this.f12890z.setContentDescription(this.f12841a0);
            }
        }
    }

    private void H0() {
        j0 j0Var = this.f12871p0;
        int iW = (int) ((j0Var != null ? j0Var.W() : DeviceOrientationRequest.OUTPUT_PERIOD_FAST) / 1000);
        TextView textView = this.f12888y;
        if (textView != null) {
            textView.setText(String.valueOf(iW));
        }
        View view = this.f12884w;
        if (view != null) {
            view.setContentDescription(this.f12842b.getQuantityString(ia.w.f77266b, iW, Integer.valueOf(iW)));
        }
    }

    private void I0() {
        x0(this.f12862l.a(), this.F);
    }

    private void J0() {
        this.f12860k.measure(0, 0);
        this.f12872q.setWidth(Math.min(this.f12860k.getMeasuredWidth(), getWidth() - (this.f12874r * 2)));
        this.f12872q.setHeight(Math.min(getHeight() - (this.f12874r * 2), this.f12860k.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        ImageView imageView;
        if (n0() && this.f12877s0 && (imageView = this.A) != null) {
            j0 j0Var = this.f12871p0;
            if (!this.f12840a.A(imageView)) {
                x0(false, this.A);
                return;
            }
            if (j0Var == null || !j0Var.c0(14)) {
                x0(false, this.A);
                this.A.setImageDrawable(this.f12845c0);
                this.A.setContentDescription(this.f12853g0);
            } else {
                x0(true, this.A);
                this.A.setImageDrawable(j0Var.T() ? this.f12843b0 : this.f12845c0);
                this.A.setContentDescription(j0Var.T() ? this.f12851f0 : this.f12853g0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x0116  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public void L0() {
        int i11;
        long jB1;
        r0.d dVar;
        long j11;
        j0 j0Var = this.f12871p0;
        if (j0Var == null) {
            return;
        }
        boolean z11 = true;
        this.f12883v0 = this.f12879t0 && Z(j0Var, this.O);
        long j12 = 0;
        this.F0 = 0L;
        r0 r0VarJ = j0Var.c0(17) ? j0Var.J() : r0.f101451a;
        long j13 = -9223372036854775807L;
        if (!r0VarJ.u()) {
            int iR = j0Var.R();
            boolean z12 = this.f12883v0;
            int i12 = z12 ? 0 : iR;
            int iT = z12 ? r0VarJ.t() - 1 : iR;
            i11 = 0;
            long j14 = 0;
            while (i12 <= iT) {
                if (i12 == iR) {
                    this.F0 = q0.O1(j14);
                }
                r0VarJ.r(i12, this.O);
                r0.d dVar2 = this.O;
                boolean z13 = z11;
                long j15 = j12;
                if (dVar2.f101493m == j13) {
                    s7.a.h(this.f12883v0 ^ z13);
                    break;
                }
                int i13 = dVar2.f101494n;
                while (true) {
                    dVar = this.O;
                    if (i13 <= dVar.f101495o) {
                        r0VarJ.j(i13, this.N);
                        int iQ = this.N.q();
                        int iD = this.N.d();
                        while (iQ < iD) {
                            long jG = this.N.g(iQ);
                            if (jG == Long.MIN_VALUE) {
                                j11 = j13;
                                long j16 = this.N.f101463d;
                                if (j16 != j11) {
                                    jG = j16;
                                }
                                iQ++;
                                j13 = j11;
                            } else {
                                j11 = j13;
                            }
                            long jP = jG + this.N.p();
                            if (jP >= j15) {
                                long[] jArr = this.B0;
                                if (i11 == jArr.length) {
                                    ?? length = jArr.length == 0 ? z13 : jArr.length * 2;
                                    this.B0 = Arrays.copyOf(jArr, (int) length);
                                    this.C0 = Arrays.copyOf(this.C0, (int) length);
                                }
                                this.B0[i11] = q0.O1(j14 + jP);
                                this.C0[i11] = this.N.r(iQ);
                                i11++;
                            }
                            iQ++;
                            j13 = j11;
                        }
                        i13++;
                    }
                }
                j14 += dVar.f101493m;
                i12++;
                z11 = z13;
                j12 = j15;
            }
            jB1 = j14;
        } else if (j0Var.c0(16)) {
            long jW = j0Var.w();
            if (jW != -9223372036854775807L) {
                jB1 = q0.b1(jW);
                i11 = 0;
            } else {
                i11 = 0;
                jB1 = 0;
            }
        } else {
            i11 = 0;
            jB1 = 0;
        }
        long jO1 = q0.O1(jB1);
        TextView textView = this.I;
        if (textView != null) {
            textView.setText(q0.x0(this.L, this.M, jO1));
        }
        g0 g0Var = this.K;
        if (g0Var != null) {
            g0Var.setDuration(jO1);
            int length2 = this.D0.length;
            int i14 = i11 + length2;
            long[] jArr2 = this.B0;
            if (i14 > jArr2.length) {
                this.B0 = Arrays.copyOf(jArr2, i14);
                this.C0 = Arrays.copyOf(this.C0, i14);
            }
            System.arraycopy(this.D0, 0, this.B0, i11, length2);
            System.arraycopy(this.E0, 0, this.C0, i11, length2);
            this.K.setAdGroupTimesMs(this.B0, this.C0, i14);
        }
        F0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0() {
        g0();
        x0(this.f12866n.getItemCount() > 0, this.C);
        I0();
    }

    private static boolean Z(j0 j0Var, r0.d dVar) {
        r0 r0VarJ;
        int iT;
        if (!j0Var.c0(17) || (iT = (r0VarJ = j0Var.J()).t()) <= 1 || iT > 100) {
            return false;
        }
        for (int i11 = 0; i11 < iT; i11++) {
            if (r0VarJ.r(i11, dVar).f101493m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(RecyclerView.h<?> hVar, View view) {
        this.f12860k.setAdapter(hVar);
        J0();
        this.G0 = false;
        this.f12872q.dismiss();
        this.G0 = true;
        this.f12872q.showAsDropDown(view, (getWidth() - this.f12872q.getWidth()) - this.f12874r, (-this.f12872q.getHeight()) - this.f12874r);
    }

    private com.google.common.collect.x<k> c0(a1 a1Var, int i11) {
        com.google.common.collect.x.a aVar = new com.google.common.collect.x.a();
        com.google.common.collect.x<a1.a> xVarB = a1Var.b();
        for (int i12 = 0; i12 < xVarB.size(); i12++) {
            a1.a aVar2 = xVarB.get(i12);
            if (aVar2.f() == i11) {
                for (int i13 = 0; i13 < aVar2.f101190a; i13++) {
                    if (aVar2.k(i13)) {
                        p7.u uVarD = aVar2.d(i13);
                        if ((uVarD.f101534e & 2) == 0) {
                            aVar.a(new k(a1Var, i12, i13, this.f12870p.a(uVarD)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private static int d0(TypedArray typedArray, int i11) {
        return typedArray.getInt(ia.z.U, i11);
    }

    private void g0() {
        this.f12866n.b();
        this.f12868o.b();
        j0 j0Var = this.f12871p0;
        if (j0Var != null && j0Var.c0(30) && this.f12871p0.c0(29)) {
            a1 a1VarP = this.f12871p0.p();
            this.f12868o.i(c0(a1VarP, 1));
            if (this.f12840a.A(this.C)) {
                this.f12866n.h(c0(a1VarP, 3));
            } else {
                this.f12866n.h(com.google.common.collect.x.r());
            }
        }
    }

    private static void h0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean i0(j0 j0Var) {
        Class<?> cls;
        return (j0Var == null || (cls = this.f12852g) == null || !cls.isAssignableFrom(j0Var.getClass())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean j0(j0 j0Var) {
        Class<?> cls;
        return (j0Var == null || (cls = this.f12846d) == null || !cls.isAssignableFrom(j0Var.getClass())) ? false : true;
    }

    @SuppressLint({"InlinedApi"})
    private static boolean l0(int i11) {
        return i11 == 90 || i11 == 89 || i11 == 85 || i11 == 79 || i11 == 126 || i11 == 127 || i11 == 87 || i11 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNullIf(expression = {"#1"}, result = true)
    public boolean m0(j0 j0Var) {
        try {
            if (j0(j0Var) && ((Boolean) s7.a.f(((Method) s7.a.f(this.f12850f)).invoke(j0Var, null))).booleanValue()) {
                return true;
            }
            return i0(j0Var) && ((Boolean) s7.a.f(((Method) s7.a.f(this.f12856i)).invoke(j0Var, null))).booleanValue();
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e12) {
            e = e12;
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(View view) {
        B0(!this.f12875r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = i14 - i12;
        int i21 = i18 - i16;
        if (!(i13 - i11 == i17 - i15 && i19 == i21) && this.f12872q.isShowing()) {
            J0();
            this.f12872q.update(view, (getWidth() - this.f12872q.getWidth()) - this.f12874r, (-this.f12872q.getHeight()) - this.f12874r, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(int i11) {
        if (i11 == 0) {
            b0(this.f12864m, (View) s7.a.f(this.F));
        } else if (i11 == 1) {
            b0(this.f12868o, (View) s7.a.f(this.F));
        } else {
            this.f12872q.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f11) {
        j0 j0Var = this.f12871p0;
        if (j0Var == null || !j0Var.c0(13)) {
            return;
        }
        j0 j0Var2 = this.f12871p0;
        j0Var2.j(j0Var2.e().d(f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(j0 j0Var, long j11) {
        if (this.f12883v0) {
            if (j0Var.c0(17) && j0Var.c0(10)) {
                r0 r0VarJ = j0Var.J();
                int iT = r0VarJ.t();
                int i11 = 0;
                while (true) {
                    long jE = r0VarJ.r(i11, this.O).e();
                    if (j11 < jE) {
                        break;
                    }
                    if (i11 == iT - 1) {
                        j11 = jE;
                        break;
                    } else {
                        j11 -= jE;
                        i11++;
                    }
                }
                j0Var.M(i11, j11);
            }
        } else if (j0Var.c0(5)) {
            j0Var.seekTo(j11);
        }
        F0();
    }

    private void x0(boolean z11, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.f12847d0 : this.f12849e0);
    }

    private void y0() {
        j0 j0Var = this.f12871p0;
        int iA = (int) ((j0Var != null ? j0Var.A() : 15000L) / 1000);
        TextView textView = this.f12886x;
        if (textView != null) {
            textView.setText(String.valueOf(iA));
        }
        View view = this.f12882v;
        if (view != null) {
            view.setContentDescription(this.f12842b.getQuantityString(ia.w.f77265a, iA, Integer.valueOf(iA)));
        }
    }

    private void z0(ImageView imageView, boolean z11) {
        if (imageView == null) {
            return;
        }
        if (z11) {
            imageView.setImageDrawable(this.f12863l0);
            imageView.setContentDescription(this.f12867n0);
        } else {
            imageView.setImageDrawable(this.f12865m0);
            imageView.setContentDescription(this.f12869o0);
        }
    }

    public void B0(boolean z11) {
        if (this.f12875r0 == z11) {
            return;
        }
        this.f12875r0 = z11;
        z0(this.D, z11);
        z0(this.E, z11);
        InterfaceC0213d interfaceC0213d = this.f12873q0;
        if (interfaceC0213d != null) {
            interfaceC0213d.q(z11);
        }
    }

    @Deprecated
    public void Y(m mVar) {
        s7.a.f(mVar);
        this.f12858j.add(mVar);
    }

    public boolean a0(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        j0 j0Var = this.f12871p0;
        if (j0Var == null || !l0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (j0Var.g() == 4 || !j0Var.c0(12)) {
                return true;
            }
            j0Var.C();
            return true;
        }
        if (keyCode == 89 && j0Var.c0(11)) {
            j0Var.U();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            q0.H0(j0Var, this.f12881u0);
            return true;
        }
        if (keyCode == 87) {
            if (!j0Var.c0(9)) {
                return true;
            }
            j0Var.K();
            return true;
        }
        if (keyCode == 88) {
            if (!j0Var.c0(7)) {
                return true;
            }
            j0Var.F();
            return true;
        }
        if (keyCode == 126) {
            q0.G0(j0Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        q0.F0(j0Var);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a0(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public void e0() {
        this.f12840a.C();
    }

    public void f0() {
        this.f12840a.F();
    }

    public j0 getPlayer() {
        return this.f12871p0;
    }

    public int getRepeatToggleModes() {
        return this.A0;
    }

    public boolean getShowShuffleButton() {
        return this.f12840a.A(this.A);
    }

    public boolean getShowSubtitleButton() {
        return this.f12840a.A(this.C);
    }

    public int getShowTimeoutMs() {
        return this.f12887x0;
    }

    public boolean getShowVrButton() {
        return this.f12840a.A(this.B);
    }

    public boolean k0() {
        return this.f12840a.I();
    }

    public boolean n0() {
        return getVisibility() == 0;
    }

    void o0() {
        Iterator<m> it = this.f12858j.iterator();
        while (it.hasNext()) {
            it.next().n(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f12840a.K();
        this.f12877s0 = true;
        if (k0()) {
            this.f12840a.S();
        }
        w0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12840a.L();
        this.f12877s0 = false;
        removeCallbacks(this.P);
        this.f12840a.R();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f12840a.M(z11, i11, i12, i13, i14);
    }

    @Deprecated
    public void s0(m mVar) {
        this.f12858j.remove(mVar);
    }

    public void setAnimationEnabled(boolean z11) {
        this.f12840a.T(z11);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.D0 = new long[0];
            this.E0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) s7.a.f(zArr);
            s7.a.a(jArr.length == zArr2.length);
            this.D0 = jArr;
            this.E0 = zArr2;
        }
        L0();
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0213d interfaceC0213d) {
        this.f12873q0 = interfaceC0213d;
        A0(this.D, interfaceC0213d != null);
        A0(this.E, interfaceC0213d != null);
    }

    public void setPlayer(j0 j0Var) {
        s7.a.h(Looper.myLooper() == Looper.getMainLooper());
        s7.a.a(j0Var == null || j0Var.F0() == Looper.getMainLooper());
        j0 j0Var2 = this.f12871p0;
        if (j0Var2 == j0Var) {
            return;
        }
        if (j0Var2 != null) {
            j0Var2.e0(this.f12844c);
        }
        this.f12871p0 = j0Var;
        if (j0Var != null) {
            j0Var.D0(this.f12844c);
        }
        w0();
    }

    public void setProgressUpdateListener(f fVar) {
    }

    public void setRepeatToggleModes(int i11) {
        this.A0 = i11;
        j0 j0Var = this.f12871p0;
        if (j0Var != null && j0Var.c0(15)) {
            int iH = this.f12871p0.h();
            if (i11 == 0 && iH != 0) {
                this.f12871p0.i(0);
            } else if (i11 == 1 && iH == 2) {
                this.f12871p0.i(1);
            } else if (i11 == 2 && iH == 1) {
                this.f12871p0.i(2);
            }
        }
        this.f12840a.U(this.f12890z, i11 != 0);
        G0();
    }

    public void setShowFastForwardButton(boolean z11) {
        this.f12840a.U(this.f12882v, z11);
        C0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z11) {
        this.f12879t0 = z11;
        L0();
    }

    public void setShowNextButton(boolean z11) {
        this.f12840a.U(this.f12878t, z11);
        C0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z11) {
        this.f12881u0 = z11;
        D0();
    }

    public void setShowPreviousButton(boolean z11) {
        this.f12840a.U(this.f12876s, z11);
        C0();
    }

    public void setShowRewindButton(boolean z11) {
        this.f12840a.U(this.f12884w, z11);
        C0();
    }

    public void setShowShuffleButton(boolean z11) {
        this.f12840a.U(this.A, z11);
        K0();
    }

    public void setShowSubtitleButton(boolean z11) {
        this.f12840a.U(this.C, z11);
    }

    public void setShowTimeoutMs(int i11) {
        this.f12887x0 = i11;
        if (k0()) {
            this.f12840a.S();
        }
    }

    public void setShowVrButton(boolean z11) {
        this.f12840a.U(this.B, z11);
    }

    public void setTimeBarMinUpdateInterval(int i11) {
        this.f12891z0 = q0.r(i11, 16, 1000);
    }

    public void setTimeBarScrubbingEnabled(boolean z11) {
        this.f12889y0 = z11;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.B;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            x0(onClickListener != null, this.B);
        }
    }

    void t0() {
        ImageView imageView = this.f12880u;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void v0() {
        this.f12840a.X();
    }

    void w0() {
        D0();
        C0();
        G0();
        K0();
        M0();
        E0();
        L0();
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:100:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x0277  */
    /* JADX WARN: Code duplicated, block: B:44:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:50:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:54:0x02fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x034e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0370  */
    /* JADX WARN: Code duplicated, block: B:62:0x0387  */
    /* JADX WARN: Code duplicated, block: B:65:0x0398  */
    /* JADX WARN: Code duplicated, block: B:68:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:72:0x03e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:74:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x0409  */
    /* JADX WARN: Code duplicated, block: B:81:0x0415 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x0417  */
    /* JADX WARN: Code duplicated, block: B:83:0x041f  */
    /* JADX WARN: Code duplicated, block: B:86:0x0427  */
    /* JADX WARN: Code duplicated, block: B:89:0x0438  */
    /* JADX WARN: Code duplicated, block: B:92:0x0449  */
    /* JADX WARN: Code duplicated, block: B:95:0x0470  */
    /* JADX WARN: Code duplicated, block: B:96:0x047c  */
    /* JADX WARN: Code duplicated, block: B:99:0x05e0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.media3.ui.g0] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.view.View, android.view.ViewGroup, android.widget.TextView, androidx.media3.ui.d$a] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.LayoutInflater] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 3 */
    public d(Context context, AttributeSet attributeSet, int i11, AttributeSet attributeSet2) throws Throwable {
        final d dVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i19;
        boolean z15;
        boolean z16;
        boolean z17;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z18;
        String str;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls;
        Method method5;
        ImageView imageView;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        g0 g0Var;
        View viewFindViewById4;
        int i28;
        ImageView imageView2;
        final d dVar2;
        Context context2;
        ?? r11;
        g0 g0Var2;
        Resources resources;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        Typeface typefaceH;
        ImageView imageView6;
        TextView textView;
        View view;
        ImageView imageView7;
        TextView textView2;
        View view2;
        ImageView imageView8;
        ImageView imageView9;
        ImageView imageView10;
        boolean z19;
        super(context, attributeSet, i11);
        Class cls2 = Boolean.TYPE;
        int i29 = ia.v.f77260c;
        int i31 = ia.r.f77218p;
        int i32 = ia.r.f77217o;
        int i33 = ia.r.f77216n;
        int i34 = ia.r.f77225w;
        int i35 = ia.r.f77219q;
        int resourceId = ia.r.f77226x;
        int i36 = ia.r.f77215m;
        int i37 = ia.r.f77214l;
        int i38 = ia.r.f77221s;
        int i39 = ia.r.f77222t;
        int i41 = ia.r.f77220r;
        String str2 = "isScrubbingModeEnabled";
        int i42 = ia.r.f77224v;
        int i43 = ia.r.f77223u;
        int i44 = ia.r.A;
        int resourceId2 = ia.r.f77228z;
        int i45 = ia.r.B;
        this.f12881u0 = true;
        this.f12887x0 = 5000;
        this.A0 = 0;
        this.f12891z0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, ia.z.H, i11, 0);
            try {
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(ia.z.J, i29);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(ia.z.P, i31);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(ia.z.O, i32);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(ia.z.N, i33);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(ia.z.K, i34);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(ia.z.Q, i35);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(ia.z.V, resourceId);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(ia.z.M, i36);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(ia.z.L, i37);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(ia.z.S, i38);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(ia.z.T, i39);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(ia.z.R, i41);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(ia.z.f77305f0, i42);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(ia.z.f77303e0, i43);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(ia.z.f77309h0, i44);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ia.z.f77307g0, resourceId2);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(ia.z.f77315k0, i45);
                dVar = this;
                try {
                    dVar.f12887x0 = typedArrayObtainStyledAttributes.getInt(ia.z.f77299c0, dVar.f12887x0);
                    dVar.A0 = d0(typedArrayObtainStyledAttributes, dVar.A0);
                    boolean z21 = typedArrayObtainStyledAttributes.getBoolean(ia.z.Z, true);
                    boolean z22 = typedArrayObtainStyledAttributes.getBoolean(ia.z.W, true);
                    z12 = typedArrayObtainStyledAttributes.getBoolean(ia.z.Y, true);
                    boolean z23 = typedArrayObtainStyledAttributes.getBoolean(ia.z.X, true);
                    boolean z24 = typedArrayObtainStyledAttributes.getBoolean(ia.z.f77295a0, false);
                    boolean z25 = typedArrayObtainStyledAttributes.getBoolean(ia.z.f77297b0, false);
                    boolean z26 = typedArrayObtainStyledAttributes.getBoolean(ia.z.f77301d0, false);
                    dVar.f12889y0 = typedArrayObtainStyledAttributes.getBoolean(ia.z.f77313j0, false);
                    dVar.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(ia.z.f77311i0, dVar.f12891z0));
                    boolean z27 = typedArrayObtainStyledAttributes.getBoolean(ia.z.I, true);
                    typedArrayObtainStyledAttributes.recycle();
                    i13 = resourceId7;
                    i14 = resourceId9;
                    i15 = resourceId8;
                    i16 = resourceId10;
                    z13 = z21;
                    z17 = z24;
                    z14 = z22;
                    z11 = z23;
                    z18 = z27;
                    i22 = resourceId11;
                    i23 = resourceId6;
                    i24 = resourceId12;
                    i25 = resourceId5;
                    i26 = resourceId4;
                    i27 = resourceId3;
                    z15 = z26;
                    i19 = resourceId13;
                    i17 = resourceId16;
                    i12 = resourceId15;
                    i21 = resourceId17;
                    z16 = z25;
                    i18 = resourceId14;
                } catch (Throwable th2) {
                    th = th2;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            dVar = this;
            i12 = i43;
            i13 = i34;
            i14 = i36;
            i15 = i35;
            i16 = i37;
            i17 = i44;
            i18 = i42;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = true;
            i19 = i41;
            z15 = false;
            z16 = false;
            z17 = false;
            i21 = i45;
            i22 = i38;
            i23 = i33;
            i24 = i39;
            i25 = i32;
            i26 = i31;
            i27 = i29;
            z18 = true;
        }
        LayoutInflater.from(context).inflate(i27, dVar);
        dVar.setDescendantFocusability(262144);
        dVar.f12844c = new c();
        dVar.f12858j = new CopyOnWriteArrayList<>();
        dVar.N = new r0.b();
        dVar.O = new r0.d();
        StringBuilder sb2 = new StringBuilder();
        dVar.L = sb2;
        int i46 = i21;
        dVar.M = new Formatter(sb2, Locale.getDefault());
        dVar.B0 = new long[0];
        dVar.C0 = new boolean[0];
        dVar.D0 = new long[0];
        dVar.E0 = new boolean[0];
        dVar.P = new Runnable() { // from class: ia.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f77190a.F0();
            }
        };
        try {
            Class[] clsArr = {cls2};
            str = "setScrubbingModeEnabled";
            try {
                try {
                    method = ExoPlayer.class.getMethod(str, clsArr);
                    str2 = str2;
                    try {
                        method2 = ExoPlayer.class.getMethod(str2, null);
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        method2 = null;
                    }
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    method = null;
                    method2 = null;
                    Method method6 = method;
                    dVar.f12846d = ExoPlayer.class;
                    dVar.f12848e = method6;
                    dVar.f12850f = method2;
                    cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
                    method4 = cls.getMethod(str, cls2);
                    method3 = null;
                    try {
                        method5 = cls.getMethod(str2, null);
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        method5 = method3;
                    }
                    dVar.f12852g = cls;
                    dVar.f12854h = method4;
                    dVar.f12856i = method5;
                    dVar.I = (TextView) dVar.findViewById(ia.t.f77242m);
                    dVar.J = (TextView) dVar.findViewById(ia.t.G);
                    imageView = (ImageView) dVar.findViewById(ia.t.R);
                    dVar.C = imageView;
                    if (imageView != null) {
                        imageView.setOnClickListener(dVar.f12844c);
                    }
                    ImageView imageView11 = (ImageView) dVar.findViewById(ia.t.f77248s);
                    dVar.D = imageView11;
                    h0(imageView11, new View.OnClickListener() { // from class: ia.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            this.f77191a.p0(view3);
                        }
                    });
                    ImageView imageView12 = (ImageView) dVar.findViewById(ia.t.f77253x);
                    dVar.E = imageView12;
                    h0(imageView12, new View.OnClickListener() { // from class: ia.h
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            this.f77191a.p0(view3);
                        }
                    });
                    viewFindViewById = dVar.findViewById(ia.t.N);
                    dVar.F = viewFindViewById;
                    if (viewFindViewById != null) {
                        viewFindViewById.setOnClickListener(dVar.f12844c);
                    }
                    viewFindViewById2 = dVar.findViewById(ia.t.F);
                    dVar.G = viewFindViewById2;
                    if (viewFindViewById2 != null) {
                        viewFindViewById2.setOnClickListener(dVar.f12844c);
                    }
                    viewFindViewById3 = dVar.findViewById(ia.t.f77232c);
                    dVar.H = viewFindViewById3;
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setOnClickListener(dVar.f12844c);
                    }
                    g0Var = (g0) dVar.findViewById(ia.t.I);
                    viewFindViewById4 = dVar.findViewById(ia.t.J);
                    if (g0Var != null) {
                        dVar.K = g0Var;
                        i28 = resourceId2;
                        imageView2 = imageView;
                        dVar2 = dVar;
                        r11 = method3;
                        context2 = context;
                    } else if (viewFindViewById4 != null) {
                        i28 = resourceId2;
                        imageView2 = imageView;
                        dVar2 = this;
                        r11 = method3;
                        context2 = context;
                        DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context2, null, 0, attributeSet2, ia.y.f77293a);
                        defaultTimeBar.setId(ia.t.I);
                        defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
                        ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
                        int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
                        viewGroup.removeView(viewFindViewById4);
                        viewGroup.addView(defaultTimeBar, iIndexOfChild);
                        dVar2.K = defaultTimeBar;
                    } else {
                        i28 = resourceId2;
                        imageView2 = imageView;
                        dVar2 = dVar;
                        ?? r12 = method3;
                        context2 = context;
                        dVar2.K = r12;
                        r11 = r12;
                    }
                    g0Var2 = dVar2.K;
                    if (g0Var2 != null) {
                        g0Var2.a(dVar2.f12844c);
                    }
                    resources = context2.getResources();
                    dVar2.f12842b = resources;
                    imageView3 = (ImageView) dVar2.findViewById(ia.t.E);
                    dVar2.f12880u = imageView3;
                    if (imageView3 != null) {
                        imageView3.setOnClickListener(dVar2.f12844c);
                    }
                    imageView4 = (ImageView) dVar2.findViewById(ia.t.H);
                    dVar2.f12876s = imageView4;
                    if (imageView4 != null) {
                        imageView4.setImageDrawable(q0.g0(context2, resources, i15));
                        imageView4.setOnClickListener(dVar2.f12844c);
                    }
                    imageView5 = (ImageView) dVar2.findViewById(ia.t.f77254y);
                    dVar2.f12878t = imageView5;
                    if (imageView5 != null) {
                        imageView5.setImageDrawable(q0.g0(context2, resources, i23));
                        imageView5.setOnClickListener(dVar2.f12844c);
                    }
                    typefaceH = j5.h.h(context2, ia.s.f77229a);
                    imageView6 = (ImageView) dVar2.findViewById(ia.t.L);
                    textView = (TextView) dVar2.findViewById(ia.t.M);
                    if (imageView6 != null) {
                        imageView6.setImageDrawable(q0.g0(context2, resources, resourceId));
                        dVar2.f12884w = imageView6;
                        dVar2.f12888y = r11;
                    } else if (textView != null) {
                        textView.setTypeface(typefaceH);
                        dVar2.f12888y = textView;
                        dVar2.f12884w = textView;
                    } else {
                        dVar2.f12888y = r11;
                        dVar2.f12884w = r11;
                    }
                    view = dVar2.f12884w;
                    if (view != null) {
                        view.setOnClickListener(dVar2.f12844c);
                    }
                    imageView7 = (ImageView) dVar2.findViewById(ia.t.f77246q);
                    textView2 = (TextView) dVar2.findViewById(ia.t.f77247r);
                    if (imageView7 != null) {
                        imageView7.setImageDrawable(q0.g0(context2, resources, i13));
                        dVar2.f12882v = imageView7;
                        dVar2.f12886x = r11;
                    } else if (textView2 != null) {
                        textView2.setTypeface(typefaceH);
                        dVar2.f12886x = textView2;
                        dVar2.f12882v = textView2;
                    } else {
                        dVar2.f12886x = r11;
                        dVar2.f12882v = r11;
                    }
                    view2 = dVar2.f12882v;
                    if (view2 != null) {
                        view2.setOnClickListener(dVar2.f12844c);
                    }
                    imageView8 = (ImageView) dVar2.findViewById(ia.t.K);
                    dVar2.f12890z = imageView8;
                    if (imageView8 != null) {
                        imageView8.setOnClickListener(dVar2.f12844c);
                    }
                    imageView9 = (ImageView) dVar2.findViewById(ia.t.O);
                    dVar2.A = imageView9;
                    if (imageView9 != null) {
                        imageView9.setOnClickListener(dVar2.f12844c);
                    }
                    dVar2.f12847d0 = resources.getInteger(ia.u.f77257b) / 100.0f;
                    dVar2.f12849e0 = resources.getInteger(ia.u.f77256a) / 100.0f;
                    imageView10 = (ImageView) dVar2.findViewById(ia.t.V);
                    dVar2.B = imageView10;
                    if (imageView10 != null) {
                        imageView10.setImageDrawable(q0.g0(context2, resources, i46));
                        dVar2.x0(false, imageView10);
                    }
                    w wVar = new w(dVar2);
                    dVar2.f12840a = wVar;
                    wVar.T(z18);
                    h hVar = dVar2.new h(new String[]{resources.getString(ia.x.f77274h), resources.getString(ia.x.f77291y)}, new Drawable[]{q0.g0(context2, resources, ia.r.f77227y), q0.g0(context2, resources, ia.r.f77213k)});
                    dVar2.f12862l = hVar;
                    dVar2.f12874r = resources.getDimensionPixelSize(ia.q.f77199a);
                    RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context2).inflate(ia.v.f77262e, r11);
                    dVar2.f12860k = recyclerView;
                    recyclerView.setAdapter(hVar);
                    recyclerView.setLayoutManager(new LinearLayoutManager(dVar2.getContext()));
                    PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
                    dVar2.f12872q = popupWindow;
                    popupWindow.setOnDismissListener(dVar2.f12844c);
                    dVar2.G0 = true;
                    dVar2.f12870p = new ia.d(dVar2.getResources());
                    dVar2.f12855h0 = q0.g0(context2, resources, i17);
                    dVar2.f12857i0 = q0.g0(context2, resources, i28);
                    dVar2.f12859j0 = resources.getString(ia.x.f77268b);
                    dVar2.f12861k0 = resources.getString(ia.x.f77267a);
                    dVar2.f12866n = new j();
                    dVar2.f12868o = new b();
                    dVar2.f12864m = dVar2.new e(resources.getStringArray(ia.o.f77197a), H0);
                    dVar2.Q = q0.g0(context2, resources, i26);
                    dVar2.R = q0.g0(context2, resources, i25);
                    dVar2.f12863l0 = q0.g0(context2, resources, i14);
                    dVar2.f12865m0 = q0.g0(context2, resources, i16);
                    dVar2.S = q0.g0(context2, resources, i22);
                    dVar2.T = q0.g0(context2, resources, i24);
                    dVar2.U = q0.g0(context2, resources, i19);
                    dVar2.f12843b0 = q0.g0(context2, resources, i18);
                    dVar2.f12845c0 = q0.g0(context2, resources, i12);
                    dVar2.f12867n0 = resources.getString(ia.x.f77270d);
                    dVar2.f12869o0 = resources.getString(ia.x.f77269c);
                    dVar2.V = resources.getString(ia.x.f77276j);
                    dVar2.W = resources.getString(ia.x.f77277k);
                    dVar2.f12841a0 = resources.getString(ia.x.f77275i);
                    dVar2.f12851f0 = resources.getString(ia.x.f77280n);
                    dVar2.f12853g0 = resources.getString(ia.x.f77279m);
                    wVar.U((ViewGroup) dVar2.findViewById(ia.t.f77234e), true);
                    wVar.U(dVar2.f12882v, z14);
                    wVar.U(dVar2.f12884w, z13);
                    wVar.U(imageView4, z12);
                    wVar.U(imageView5, z11);
                    wVar.U(imageView9, z17);
                    wVar.U(imageView2, z16);
                    wVar.U(imageView10, z15);
                    if (dVar2.A0 != 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    wVar.U(imageView8, z19);
                    dVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ia.i
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(View view3, int i47, int i48, int i49, int i51, int i52, int i53, int i54, int i55) {
                            this.f77192a.q0(view3, i47, i48, i49, i51, i52, i53, i54, i55);
                        }
                    });
                }
                cls = Class.forName("androidx.media3.transformer.CompositionPlayer");
                try {
                    method4 = cls.getMethod(str, cls2);
                    method3 = null;
                    method5 = cls.getMethod(str2, null);
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    method3 = null;
                    method4 = null;
                }
            } catch (ClassNotFoundException | NoSuchMethodException unused5) {
                method3 = null;
                method4 = null;
                cls = null;
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused6) {
            str = "setScrubbingModeEnabled";
        }
        Method method7 = method;
        dVar.f12846d = ExoPlayer.class;
        dVar.f12848e = method7;
        dVar.f12850f = method2;
        dVar.f12852g = cls;
        dVar.f12854h = method4;
        dVar.f12856i = method5;
        dVar.I = (TextView) dVar.findViewById(ia.t.f77242m);
        dVar.J = (TextView) dVar.findViewById(ia.t.G);
        imageView = (ImageView) dVar.findViewById(ia.t.R);
        dVar.C = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(dVar.f12844c);
        }
        ImageView imageView13 = (ImageView) dVar.findViewById(ia.t.f77248s);
        dVar.D = imageView13;
        h0(imageView13, new View.OnClickListener() { // from class: ia.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f77191a.p0(view3);
            }
        });
        ImageView imageView14 = (ImageView) dVar.findViewById(ia.t.f77253x);
        dVar.E = imageView14;
        h0(imageView14, new View.OnClickListener() { // from class: ia.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                this.f77191a.p0(view3);
            }
        });
        viewFindViewById = dVar.findViewById(ia.t.N);
        dVar.F = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(dVar.f12844c);
        }
        viewFindViewById2 = dVar.findViewById(ia.t.F);
        dVar.G = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(dVar.f12844c);
        }
        viewFindViewById3 = dVar.findViewById(ia.t.f77232c);
        dVar.H = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(dVar.f12844c);
        }
        g0Var = (g0) dVar.findViewById(ia.t.I);
        viewFindViewById4 = dVar.findViewById(ia.t.J);
        if (g0Var != null) {
            dVar.K = g0Var;
            i28 = resourceId2;
            imageView2 = imageView;
            dVar2 = dVar;
            r11 = method3;
            context2 = context;
        } else if (viewFindViewById4 != null) {
            i28 = resourceId2;
            imageView2 = imageView;
            dVar2 = this;
            r11 = method3;
            context2 = context;
            DefaultTimeBar defaultTimeBar2 = new DefaultTimeBar(context2, null, 0, attributeSet2, ia.y.f77293a);
            defaultTimeBar2.setId(ia.t.I);
            defaultTimeBar2.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup2 = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild2 = viewGroup2.indexOfChild(viewFindViewById4);
            viewGroup2.removeView(viewFindViewById4);
            viewGroup2.addView(defaultTimeBar2, iIndexOfChild2);
            dVar2.K = defaultTimeBar2;
        } else {
            i28 = resourceId2;
            imageView2 = imageView;
            dVar2 = dVar;
            ?? r13 = method3;
            context2 = context;
            dVar2.K = r13;
            r11 = r13;
        }
        g0Var2 = dVar2.K;
        if (g0Var2 != null) {
            g0Var2.a(dVar2.f12844c);
        }
        resources = context2.getResources();
        dVar2.f12842b = resources;
        imageView3 = (ImageView) dVar2.findViewById(ia.t.E);
        dVar2.f12880u = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(dVar2.f12844c);
        }
        imageView4 = (ImageView) dVar2.findViewById(ia.t.H);
        dVar2.f12876s = imageView4;
        if (imageView4 != null) {
            imageView4.setImageDrawable(q0.g0(context2, resources, i15));
            imageView4.setOnClickListener(dVar2.f12844c);
        }
        imageView5 = (ImageView) dVar2.findViewById(ia.t.f77254y);
        dVar2.f12878t = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(q0.g0(context2, resources, i23));
            imageView5.setOnClickListener(dVar2.f12844c);
        }
        typefaceH = j5.h.h(context2, ia.s.f77229a);
        imageView6 = (ImageView) dVar2.findViewById(ia.t.L);
        textView = (TextView) dVar2.findViewById(ia.t.M);
        if (imageView6 != null) {
            imageView6.setImageDrawable(q0.g0(context2, resources, resourceId));
            dVar2.f12884w = imageView6;
            dVar2.f12888y = r11;
        } else if (textView != null) {
            textView.setTypeface(typefaceH);
            dVar2.f12888y = textView;
            dVar2.f12884w = textView;
        } else {
            dVar2.f12888y = r11;
            dVar2.f12884w = r11;
        }
        view = dVar2.f12884w;
        if (view != null) {
            view.setOnClickListener(dVar2.f12844c);
        }
        imageView7 = (ImageView) dVar2.findViewById(ia.t.f77246q);
        textView2 = (TextView) dVar2.findViewById(ia.t.f77247r);
        if (imageView7 != null) {
            imageView7.setImageDrawable(q0.g0(context2, resources, i13));
            dVar2.f12882v = imageView7;
            dVar2.f12886x = r11;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceH);
            dVar2.f12886x = textView2;
            dVar2.f12882v = textView2;
        } else {
            dVar2.f12886x = r11;
            dVar2.f12882v = r11;
        }
        view2 = dVar2.f12882v;
        if (view2 != null) {
            view2.setOnClickListener(dVar2.f12844c);
        }
        imageView8 = (ImageView) dVar2.findViewById(ia.t.K);
        dVar2.f12890z = imageView8;
        if (imageView8 != null) {
            imageView8.setOnClickListener(dVar2.f12844c);
        }
        imageView9 = (ImageView) dVar2.findViewById(ia.t.O);
        dVar2.A = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(dVar2.f12844c);
        }
        dVar2.f12847d0 = resources.getInteger(ia.u.f77257b) / 100.0f;
        dVar2.f12849e0 = resources.getInteger(ia.u.f77256a) / 100.0f;
        imageView10 = (ImageView) dVar2.findViewById(ia.t.V);
        dVar2.B = imageView10;
        if (imageView10 != null) {
            imageView10.setImageDrawable(q0.g0(context2, resources, i46));
            dVar2.x0(false, imageView10);
        }
        w wVar2 = new w(dVar2);
        dVar2.f12840a = wVar2;
        wVar2.T(z18);
        h hVar2 = dVar2.new h(new String[]{resources.getString(ia.x.f77274h), resources.getString(ia.x.f77291y)}, new Drawable[]{q0.g0(context2, resources, ia.r.f77227y), q0.g0(context2, resources, ia.r.f77213k)});
        dVar2.f12862l = hVar2;
        dVar2.f12874r = resources.getDimensionPixelSize(ia.q.f77199a);
        RecyclerView recyclerView2 = (RecyclerView) LayoutInflater.from(context2).inflate(ia.v.f77262e, r11);
        dVar2.f12860k = recyclerView2;
        recyclerView2.setAdapter(hVar2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(dVar2.getContext()));
        PopupWindow popupWindow2 = new PopupWindow((View) recyclerView2, -2, -2, true);
        dVar2.f12872q = popupWindow2;
        popupWindow2.setOnDismissListener(dVar2.f12844c);
        dVar2.G0 = true;
        dVar2.f12870p = new ia.d(dVar2.getResources());
        dVar2.f12855h0 = q0.g0(context2, resources, i17);
        dVar2.f12857i0 = q0.g0(context2, resources, i28);
        dVar2.f12859j0 = resources.getString(ia.x.f77268b);
        dVar2.f12861k0 = resources.getString(ia.x.f77267a);
        dVar2.f12866n = new j();
        dVar2.f12868o = new b();
        dVar2.f12864m = dVar2.new e(resources.getStringArray(ia.o.f77197a), H0);
        dVar2.Q = q0.g0(context2, resources, i26);
        dVar2.R = q0.g0(context2, resources, i25);
        dVar2.f12863l0 = q0.g0(context2, resources, i14);
        dVar2.f12865m0 = q0.g0(context2, resources, i16);
        dVar2.S = q0.g0(context2, resources, i22);
        dVar2.T = q0.g0(context2, resources, i24);
        dVar2.U = q0.g0(context2, resources, i19);
        dVar2.f12843b0 = q0.g0(context2, resources, i18);
        dVar2.f12845c0 = q0.g0(context2, resources, i12);
        dVar2.f12867n0 = resources.getString(ia.x.f77270d);
        dVar2.f12869o0 = resources.getString(ia.x.f77269c);
        dVar2.V = resources.getString(ia.x.f77276j);
        dVar2.W = resources.getString(ia.x.f77277k);
        dVar2.f12841a0 = resources.getString(ia.x.f77275i);
        dVar2.f12851f0 = resources.getString(ia.x.f77280n);
        dVar2.f12853g0 = resources.getString(ia.x.f77279m);
        wVar2.U((ViewGroup) dVar2.findViewById(ia.t.f77234e), true);
        wVar2.U(dVar2.f12882v, z14);
        wVar2.U(dVar2.f12884w, z13);
        wVar2.U(imageView4, z12);
        wVar2.U(imageView5, z11);
        wVar2.U(imageView9, z17);
        wVar2.U(imageView2, z16);
        wVar2.U(imageView10, z15);
        if (dVar2.A0 != 0) {
            z19 = true;
        } else {
            z19 = false;
        }
        wVar2.U(imageView8, z19);
        dVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ia.i
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i47, int i48, int i49, int i51, int i52, int i53, int i54, int i55) {
                this.f77192a.q0(view3, i47, i48, i49, i51, i52, i53, i54, i55);
            }
        });
    }
}
