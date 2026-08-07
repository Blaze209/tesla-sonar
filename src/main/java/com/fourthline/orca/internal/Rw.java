package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.res.Resources;
import com.fourthline.orca.core.flavor.OrcaLocalization;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class Rw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f27683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OrcaLocalization f27684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F5 f27685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Locale f27686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f27687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f27688f;

    public Rw(Activity activity, OrcaLocalization localization) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        p013kotlin.jvm.internal.s.k(localization, "localization");
        this.f27683a = activity;
        this.f27684b = localization;
        this.f27685c = new F5();
        Locale localeA = AbstractC3972w5.a(activity, localization);
        this.f27686d = localeA;
        this.f27687e = b(localeA);
        this.f27688f = new LinkedHashMap();
    }

    public final Locale a() {
        return this.f27686d;
    }

    public final Resources b() {
        return this.f27687e;
    }

    public final void c() {
        Locale localeA = AbstractC3972w5.a(this.f27683a, this.f27684b);
        this.f27686d = localeA;
        this.f27687e = b(localeA);
    }

    public static /* synthetic */ List a(Rw rw2, Locale locale, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            locale = rw2.f27686d;
        }
        return rw2.a(locale);
    }

    public final Resources b(Locale locale) {
        p013kotlin.jvm.internal.s.k(locale, "locale");
        return AbstractC3972w5.a(this.f27683a, locale);
    }

    public final List a(Locale targetLocale) {
        p013kotlin.jvm.internal.s.k(targetLocale, "targetLocale");
        String iSO3Country = this.f27686d.getISO3Country();
        List list = (List) this.f27688f.get(iSO3Country);
        if (list != null) {
            return list;
        }
        List listA = this.f27685c.a(b(targetLocale));
        this.f27688f.put(iSO3Country, listA);
        return listA;
    }
}
