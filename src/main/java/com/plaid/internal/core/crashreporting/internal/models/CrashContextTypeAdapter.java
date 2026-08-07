package com.plaid.internal.core.crashreporting.internal.models;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.r;
import java.lang.reflect.Type;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/CrashContextTypeAdapter;", "Lcom/google/gson/r;", "Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;", "<init>", "()V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/q;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/gson/l;", "serialize", "(Lcom/plaid/internal/core/crashreporting/internal/models/CrashContext;Ljava/lang/reflect/Type;Lcom/google/gson/q;)Lcom/google/gson/l;", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CrashContextTypeAdapter implements r<CrashContext> {
    @Override // com.google.gson.r
    public l serialize(CrashContext src, Type typeOfSrc, q context) {
        if (src == null) {
            return new n();
        }
        Map<String, String> tags$crash_reporting_release = src.getTags$crash_reporting_release();
        if (tags$crash_reporting_release == null) {
            new n();
        }
        n nVar = new n();
        s.h(tags$crash_reporting_release);
        for (Map.Entry<String, String> entry : tags$crash_reporting_release.entrySet()) {
            nVar.l(entry.getKey(), entry.getValue());
        }
        return nVar;
    }
}
