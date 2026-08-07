package com.adyen.checkout.core.internal.util;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/adyen/checkout/core/internal/util/LocaleProvider;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/util/Locale;", "a", "(Landroid/content/Context;)Ljava/util/Locale;", "checkout-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LocaleProvider {
    public final Locale a(Context context) {
        s.k(context, "context");
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        s.h(locale);
        return locale;
    }
}
