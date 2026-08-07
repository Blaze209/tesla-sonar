package org.spongycastle.cms;

import org.spongycastle.asn1.cms.RecipientInfo;
import org.spongycastle.operator.GenericKey;

/* JADX INFO: loaded from: classes10.dex */
public interface RecipientInfoGenerator {
    RecipientInfo generate(GenericKey genericKey);
}
