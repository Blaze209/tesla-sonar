package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f42377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f42378d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private pt.d f42381g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextPaint f42375a = new TextPaint(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final pt.f f42376b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42379e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private WeakReference<b> f42380f = new WeakReference<>(null);

    class a extends pt.f {
        a() {
        }

        @Override // pt.f
        public void a(int i11) {
            x.this.f42379e = true;
            b bVar = (b) x.this.f42380f.get();
            if (bVar != null) {
                bVar.a();
            }
        }

        @Override // pt.f
        public void b(@NonNull Typeface typeface, boolean z11) {
            if (z11) {
                return;
            }
            x.this.f42379e = true;
            b bVar = (b) x.this.f42380f.get();
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public interface b {
        void a();

        @NonNull
        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public x(b bVar) {
        j(bVar);
    }

    private float c(String str) {
        return str == null ? BitmapDescriptorFactory.HUE_RED : Math.abs(this.f42375a.getFontMetrics().ascent);
    }

    private float d(CharSequence charSequence) {
        return charSequence == null ? BitmapDescriptorFactory.HUE_RED : this.f42375a.measureText(charSequence, 0, charSequence.length());
    }

    private void i(String str) {
        this.f42377c = d(str);
        this.f42378d = c(str);
        this.f42379e = false;
    }

    public pt.d e() {
        return this.f42381g;
    }

    public float f(String str) {
        if (!this.f42379e) {
            return this.f42378d;
        }
        i(str);
        return this.f42378d;
    }

    @NonNull
    public TextPaint g() {
        return this.f42375a;
    }

    public float h(String str) {
        if (!this.f42379e) {
            return this.f42377c;
        }
        i(str);
        return this.f42377c;
    }

    public void j(b bVar) {
        this.f42380f = new WeakReference<>(bVar);
    }

    public void k(pt.d dVar, Context context) {
        if (this.f42381g != dVar) {
            this.f42381g = dVar;
            if (dVar != null) {
                dVar.o(context, this.f42375a, this.f42376b);
                b bVar = this.f42380f.get();
                if (bVar != null) {
                    this.f42375a.drawableState = bVar.getState();
                }
                dVar.n(context, this.f42375a, this.f42376b);
                this.f42379e = true;
            }
            b bVar2 = this.f42380f.get();
            if (bVar2 != null) {
                bVar2.a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    public void l(boolean z11) {
        this.f42379e = z11;
    }

    public void m(boolean z11) {
        this.f42379e = z11;
    }

    public void n(Context context) {
        this.f42381g.n(context, this.f42375a, this.f42376b);
    }
}
