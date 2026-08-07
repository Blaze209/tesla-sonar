package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
abstract class g extends com.google.android.material.internal.z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final TextInputLayout f41962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final DateFormat f41964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f41965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f41966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Runnable f41967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Runnable f41968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f41969h = 0;

    g(final String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, a aVar) {
        this.f41963b = str;
        this.f41964c = dateFormat;
        this.f41962a = textInputLayout;
        this.f41965d = aVar;
        this.f41966e = textInputLayout.getContext().getString(zs.k.L);
        this.f41967f = new Runnable() { // from class: com.google.android.material.datepicker.e
            @Override // java.lang.Runnable
            public final void run() {
                g.b(this.f41958a, str);
            }
        };
    }

    public static /* synthetic */ void a(g gVar, long j11) {
        gVar.getClass();
        gVar.f41962a.setError(String.format(gVar.f41966e, gVar.g(k.a(j11))));
        gVar.d();
    }

    public static /* synthetic */ void b(g gVar, String str) {
        TextInputLayout textInputLayout = gVar.f41962a;
        DateFormat dateFormat = gVar.f41964c;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(zs.k.G) + "\n" + String.format(context.getString(zs.k.I), gVar.g(str)) + "\n" + String.format(context.getString(zs.k.H), gVar.g(dateFormat.format(new Date(c0.k().getTimeInMillis())))));
        gVar.d();
    }

    private Runnable c(final long j11) {
        return new Runnable() { // from class: com.google.android.material.datepicker.f
            @Override // java.lang.Runnable
            public final void run() {
                g.a(this.f41960a, j11);
            }
        };
    }

    private String g(String str) {
        return str.replace(' ', (char) 160);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@NonNull Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f41963b.length() && editable.length() >= this.f41969h) {
            char cCharAt = this.f41963b.charAt(editable.length());
            if (Character.isLetterOrDigit(cCharAt)) {
                return;
            }
            editable.append(cCharAt);
        }
    }

    @Override // com.google.android.material.internal.z, android.text.TextWatcher
    public void beforeTextChanged(@NonNull CharSequence charSequence, int i11, int i12, int i13) {
        this.f41969h = charSequence.length();
    }

    abstract void d();

    abstract void e(Long l11);

    public void f(View view, Runnable runnable) {
        view.post(runnable);
    }

    @Override // com.google.android.material.internal.z, android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence, int i11, int i12, int i13) {
        this.f41962a.removeCallbacks(this.f41967f);
        this.f41962a.removeCallbacks(this.f41968g);
        this.f41962a.setError(null);
        e(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f41963b.length()) {
            return;
        }
        try {
            Date date = this.f41964c.parse(charSequence.toString());
            this.f41962a.setError(null);
            long time = date.getTime();
            if (this.f41965d.g().u0(time) && this.f41965d.q(time)) {
                e(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableC = c(time);
            this.f41968g = runnableC;
            f(this.f41962a, runnableC);
        } catch (ParseException unused) {
            f(this.f41962a, this.f41967f);
        }
    }
}
