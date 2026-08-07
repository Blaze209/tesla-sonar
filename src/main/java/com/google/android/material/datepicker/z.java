package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
public class z implements j<Long> {
    public static final Parcelable.Creator<z> CREATOR = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f42075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f42076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SimpleDateFormat f42077c;

    class a extends g {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ x f42078i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ TextInputLayout f42079j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, com.google.android.material.datepicker.a aVar, x xVar, TextInputLayout textInputLayout2) {
            super(str, dateFormat, textInputLayout, aVar);
            this.f42078i = xVar;
            this.f42079j = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.g
        void d() {
            z.this.f42075a = this.f42079j.getError();
            this.f42078i.a();
        }

        @Override // com.google.android.material.datepicker.g
        void e(Long l11) {
            if (l11 == null) {
                z.this.d();
            } else {
                z.this.H1(l11.longValue());
            }
            z.this.f42075a = null;
            this.f42078i.b(z.this.B1());
        }
    }

    class b implements Parcelable.Creator<z> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public z createFromParcel(@NonNull Parcel parcel) {
            z zVar = new z();
            zVar.f42076b = (Long) parcel.readValue(Long.class.getClassLoader());
            return zVar;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public z[] newArray(int i11) {
            return new z[i11];
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f42076b = null;
    }

    @Override // com.google.android.material.datepicker.j
    public void H1(long j11) {
        this.f42076b = Long.valueOf(j11);
    }

    @Override // com.google.android.material.datepicker.j
    @NonNull
    public String J2(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l11 = this.f42076b;
        if (l11 == null) {
            return resources.getString(zs.k.D);
        }
        return resources.getString(zs.k.B, k.k(l11.longValue()));
    }

    @Override // com.google.android.material.datepicker.j
    @NonNull
    public Collection<u5.d<Long, Long>> O2() {
        return new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.j
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Long B1() {
        return this.f42076b;
    }

    @Override // com.google.android.material.datepicker.j
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void U0(Long l11) {
        this.f42076b = l11 == null ? null : Long.valueOf(c0.a(l11.longValue()));
    }

    @Override // com.google.android.material.datepicker.j
    public View h1(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, com.google.android.material.datepicker.a aVar, @NonNull x<Long> xVar) {
        View viewInflate = layoutInflater.inflate(zs.i.f128764z, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(zs.g.T);
        EditText editText = textInputLayout.getEditText();
        if (com.google.android.material.internal.k.b()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatF = this.f42077c;
        boolean z11 = simpleDateFormatF != null;
        if (!z11) {
            simpleDateFormatF = c0.f();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatF;
        String pattern = z11 ? simpleDateFormat.toPattern() : c0.g(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l11 = this.f42076b;
        if (l11 != null) {
            editText.setText(simpleDateFormat.format(l11));
        }
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, aVar, xVar, textInputLayout));
        j.k3(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.j
    public int k0() {
        return zs.k.C;
    }

    @Override // com.google.android.material.datepicker.j
    public int r0(Context context) {
        return pt.b.d(context, zs.c.N, r.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.j
    public boolean s1() {
        return this.f42076b != null;
    }

    @Override // com.google.android.material.datepicker.j
    @NonNull
    public String s2(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l11 = this.f42076b;
        return resources.getString(zs.k.f128791z, l11 == null ? resources.getString(zs.k.A) : k.k(l11.longValue()));
    }

    @Override // com.google.android.material.datepicker.j
    @NonNull
    public Collection<Long> u1() {
        ArrayList arrayList = new ArrayList();
        Long l11 = this.f42076b;
        if (l11 != null) {
            arrayList.add(l11);
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        parcel.writeValue(this.f42076b);
    }
}
