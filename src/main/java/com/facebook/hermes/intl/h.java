package com.facebook.hermes.intl;

import android.icu.text.RuleBasedCollator;

/* JADX INFO: loaded from: classes3.dex */
public class h implements com.facebook.hermes.intl.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RuleBasedCollator f21659a = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f21660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f21661b;

        static {
            int[] iArr = new int[com.facebook.hermes.intl.a.b.values().length];
            f21661b = iArr;
            try {
                iArr[com.facebook.hermes.intl.a.b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21661b[com.facebook.hermes.intl.a.b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21661b[com.facebook.hermes.intl.a.b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.facebook.hermes.intl.a.c.values().length];
            f21660a = iArr2;
            try {
                iArr2[com.facebook.hermes.intl.a.c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21660a[com.facebook.hermes.intl.a.c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21660a[com.facebook.hermes.intl.a.c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21660a[com.facebook.hermes.intl.a.c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    h() {
    }

    @Override // com.facebook.hermes.intl.a
    public int a(String str, String str2) {
        return this.f21659a.compare(str, str2);
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a b(com.facebook.hermes.intl.a.c cVar) {
        int i11 = a.f21660a[cVar.ordinal()];
        if (i11 == 1) {
            this.f21659a.setStrength(0);
            return this;
        }
        if (i11 == 2) {
            this.f21659a.setStrength(1);
            return this;
        }
        if (i11 == 3) {
            this.f21659a.setStrength(0);
            this.f21659a.setCaseLevel(true);
            return this;
        }
        if (i11 != 4) {
            return this;
        }
        this.f21659a.setStrength(2);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a c(em.b<?> bVar) {
        RuleBasedCollator ruleBasedCollator = (RuleBasedCollator) android.icu.text.Collator.getInstance(((em.f) bVar).getLocale());
        this.f21659a = ruleBasedCollator;
        ruleBasedCollator.setDecomposition(17);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a.c d() {
        RuleBasedCollator ruleBasedCollator = this.f21659a;
        if (ruleBasedCollator == null) {
            return com.facebook.hermes.intl.a.c.LOCALE;
        }
        int strength = ruleBasedCollator.getStrength();
        if (strength == 0) {
            return this.f21659a.isCaseLevel() ? com.facebook.hermes.intl.a.c.CASE : com.facebook.hermes.intl.a.c.BASE;
        }
        return strength == 1 ? com.facebook.hermes.intl.a.c.ACCENT : com.facebook.hermes.intl.a.c.VARIANT;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a e(boolean z11) {
        if (z11) {
            this.f21659a.setAlternateHandlingShifted(true);
        }
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a f(com.facebook.hermes.intl.a.b bVar) {
        int i11 = a.f21661b[bVar.ordinal()];
        if (i11 == 1) {
            this.f21659a.setUpperCaseFirst(true);
            return this;
        }
        if (i11 != 2) {
            this.f21659a.setCaseFirstDefault();
            return this;
        }
        this.f21659a.setLowerCaseFirst(true);
        return this;
    }

    @Override // com.facebook.hermes.intl.a
    public com.facebook.hermes.intl.a g(boolean z11) {
        if (z11) {
            this.f21659a.setNumericCollation(em.d.e(Boolean.TRUE));
        }
        return this;
    }
}
