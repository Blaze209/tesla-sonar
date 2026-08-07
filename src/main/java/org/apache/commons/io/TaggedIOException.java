package org.apache.commons.io;

import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public class TaggedIOException extends IOExceptionWithCause {
    @Override // java.lang.Throwable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized IOException getCause() {
        return (IOException) super.getCause();
    }
}
