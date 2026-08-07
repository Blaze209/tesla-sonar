package com.plaid.internal.classic.networking.adapter;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.Address;
import com.google.gson.j;
import com.google.gson.k;
import com.google.gson.l;
import com.google.gson.p;
import com.google.gson.q;
import com.google.gson.r;
import com.plaid.link.result.LinkAccountType;
import java.lang.reflect.Type;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0011\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/plaid/internal/classic/networking/adapter/AccountTypeAdapter;", "Lcom/google/gson/r;", "Lcom/plaid/link/result/LinkAccountType;", "Lcom/google/gson/k;", "<init>", "()V", "Lcom/google/gson/l;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/j;", CoreConstants.CONTEXT_SCOPE_VALUE, "deserialize", "(Lcom/google/gson/l;Ljava/lang/reflect/Type;Lcom/google/gson/j;)Lcom/plaid/link/result/LinkAccountType;", "src", "typeOfSrc", "Lcom/google/gson/q;", "serialize", "(Lcom/plaid/link/result/LinkAccountType;Ljava/lang/reflect/Type;Lcom/google/gson/q;)Lcom/google/gson/l;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AccountTypeAdapter implements r<LinkAccountType>, k<LinkAccountType> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.k
    public LinkAccountType deserialize(l json, Type typeOfT, j context) {
        return json == null ? new LinkAccountType.UNKNOWN(Address.ADDRESS_NULL_PLACEHOLDER) : LinkAccountType.INSTANCE.convert(json.f());
    }

    @Override // com.google.gson.r
    public l serialize(LinkAccountType src, Type typeOfSrc, q context) {
        String json;
        if (src == null || (json = src.getJson()) == null) {
            json = "";
        }
        return new p(json);
    }
}
