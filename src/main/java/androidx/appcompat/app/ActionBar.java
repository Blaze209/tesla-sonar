package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActionBar {

    public interface b {
        void onMenuVisibilityChanged(boolean z11);
    }

    @Deprecated
    public static abstract class c {
        public abstract CharSequence a();

        public abstract View b();

        public abstract Drawable c();

        public abstract CharSequence d();

        public abstract void e();
    }

    public abstract void A(int i11);

    public abstract void B(CharSequence charSequence);

    public void C(CharSequence charSequence) {
    }

    public ActionMode D(ActionMode.Callback callback) {
        return null;
    }

    public boolean f() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h(boolean z11) {
    }

    public abstract int i();

    public Context j() {
        return null;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    public void m(Configuration configuration) {
    }

    void n() {
    }

    public boolean o(int i11, KeyEvent keyEvent) {
        return false;
    }

    public boolean p(KeyEvent keyEvent) {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(Drawable drawable);

    public abstract void s(View view, a aVar);

    public void t(boolean z11) {
    }

    public abstract void u(boolean z11);

    public abstract void v(boolean z11);

    public abstract void w(boolean z11);

    public void x(float f11) {
        if (f11 != BitmapDescriptorFactory.HUE_RED) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void y(Drawable drawable) {
    }

    public void z(boolean z11) {
    }

    public static class a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1961a;

        public a(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1961a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.f73965t);
            this.f1961a = typedArrayObtainStyledAttributes.getInt(i.j.f73970u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(int i11, int i12) {
            super(i11, i12);
            this.f1961a = 8388627;
        }

        public a(int i11, int i12, int i13) {
            super(i11, i12);
            this.f1961a = i13;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f1961a = 0;
            this.f1961a = aVar.f1961a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1961a = 0;
        }
    }
}
