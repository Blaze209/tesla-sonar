package org.spongycastle.cms;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes10.dex */
public interface CMSProcessable {
    Object getContent();

    void write(OutputStream outputStream);
}
