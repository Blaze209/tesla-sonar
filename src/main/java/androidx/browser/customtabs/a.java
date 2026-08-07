package androidx.browser.customtabs;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f2913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f2914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f2915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f2916d;

    /* JADX INFO: renamed from: androidx.browser.customtabs.a$a, reason: collision with other inner class name */
    public static final class C0064a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Integer f2917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f2918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f2919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f2920d;

        @NonNull
        public a a() {
            return new a(this.f2917a, this.f2918b, this.f2919c, this.f2920d);
        }

        @NonNull
        public C0064a b(int i11) {
            this.f2919c = Integer.valueOf(i11 | (-16777216));
            return this;
        }

        @NonNull
        public C0064a c(int i11) {
            this.f2920d = Integer.valueOf(i11);
            return this;
        }

        @NonNull
        public C0064a d(int i11) {
            this.f2918b = Integer.valueOf(i11);
            return this;
        }

        @NonNull
        public C0064a e(int i11) {
            this.f2917a = Integer.valueOf(i11 | (-16777216));
            return this;
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f2913a = num;
        this.f2914b = num2;
        this.f2915c = num3;
        this.f2916d = num4;
    }

    @NonNull
    Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f2913a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f2914b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f2915c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f2916d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
