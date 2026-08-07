package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: loaded from: classes5.dex */
public class CheckableImageButton extends androidx.appcompat.widget.k implements Checkable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f42239f = {R.attr.state_checked};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42242e;

    class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setChecked(CheckableImageButton.this.isChecked());
        }

        @Override // androidx.core.view.a
        public void g(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.g(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.r0(CheckableImageButton.this.a());
            accessibilityNodeInfoCompat.s0(CheckableImageButton.this.isChecked());
        }
    }

    static class b extends r6.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f42244c;

        class a implements Parcelable.ClassLoaderCreator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@NonNull Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(@NonNull Parcel parcel) {
            this.f42244c = parcel.readInt() == 1;
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f42244c ? 1 : 0);
        }

        public b(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel);
        }
    }

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public boolean a() {
        return this.f42241d;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f42240c;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        if (!this.f42240c) {
            return super.onCreateDrawableState(i11);
        }
        int[] iArr = f42239f;
        return View.mergeDrawableStates(super.onCreateDrawableState(i11 + iArr.length), iArr);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f42244c);
    }

    @Override // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f42244c = this.f42240c;
        return bVar;
    }

    public void setCheckable(boolean z11) {
        if (this.f42241d != z11) {
            this.f42241d = z11;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (!this.f42241d || this.f42240c == z11) {
            return;
        }
        this.f42240c = z11;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z11) {
        this.f42242e = z11;
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        if (this.f42242e) {
            super.setPressed(z11);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f42240c);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a.F);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f42241d = true;
        this.f42242e = true;
        ViewCompat.p0(this, new a());
    }
}
