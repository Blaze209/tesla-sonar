package com.plaid.gson;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.l;
import com.google.gson.n;
import com.google.gson.q;
import com.google.gson.r;
import com.plaid.link.result.LinkInstitution;
import java.lang.reflect.Type;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/gson/RNLinkInstitutionAdapter;", "Lcom/google/gson/r;", "Lcom/plaid/link/result/LinkInstitution;", "<init>", "()V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/q;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/gson/l;", "serialize", "(Lcom/plaid/link/result/LinkInstitution;Ljava/lang/reflect/Type;Lcom/google/gson/q;)Lcom/google/gson/l;", "react-native-plaid-link-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNLinkInstitutionAdapter implements r<LinkInstitution> {
    @Override // com.google.gson.r
    public l serialize(LinkInstitution src, Type typeOfSrc, q context) {
        if (src == null) {
            return new n();
        }
        n nVar = new n();
        nVar.l("id", src.getId());
        nVar.l("name", src.getName());
        return nVar;
    }
}
