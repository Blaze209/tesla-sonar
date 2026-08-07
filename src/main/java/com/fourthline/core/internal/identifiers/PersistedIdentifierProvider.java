package com.fourthline.core.internal.identifiers;

import android.content.Context;
import android.content.SharedPreferences;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.UUID;
import jn0.m;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b'\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001b\u0010\u0010\u001a\u00020\u00048VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/fourthline/core/internal/identifiers/PersistedIdentifierProvider;", "Lcom/fourthline/core/internal/identifiers/IdentifierProvider;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", Action.KEY_ATTRIBUTE, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "a", "Landroid/content/Context;", "b", "Ljava/lang/String;", "c", "Lkotlin/Lazy;", "getValue", "()Ljava/lang/String;", "value", DateTokenConverter.CONVERTER_KEY, "fourthline-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PersistedIdentifierProvider implements IdentifierProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f24128d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy value;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public PersistedIdentifierProvider(Context context, String key) {
        s.k(context, "context");
        s.k(key, "key");
        this.context = context;
        this.key = key;
        this.value = m.b(new wn0.a() { // from class: com.fourthline.core.internal.identifiers.a
            @Override // wn0.a
            public final Object invoke() {
                return PersistedIdentifierProvider.a(this.f24132a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String a(PersistedIdentifierProvider persistedIdentifierProvider) {
        SharedPreferences sharedPreferences = persistedIdentifierProvider.context.getSharedPreferences("Analytics", 0);
        String string = sharedPreferences.getString(persistedIdentifierProvider.key, null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        sharedPreferences.edit().putString(persistedIdentifierProvider.key, string2).apply();
        s.j(string2, "also(...)");
        return string2;
    }

    @Override // com.fourthline.core.internal.identifiers.IdentifierProvider
    public String getValue() {
        return (String) this.value.getValue();
    }
}
