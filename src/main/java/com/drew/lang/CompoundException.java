package com.drew.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes3.dex */
public class CompoundException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f21502a;

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f21502a != null) {
            printStream.println("--- inner exception ---");
            this.f21502a.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (this.f21502a != null) {
            sb2.append("\n");
            sb2.append("--- inner exception ---");
            sb2.append("\n");
            sb2.append(this.f21502a.toString());
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f21502a != null) {
            printWriter.println("--- inner exception ---");
            this.f21502a.printStackTrace(printWriter);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        super.printStackTrace();
        if (this.f21502a != null) {
            System.err.println("--- inner exception ---");
            this.f21502a.printStackTrace();
        }
    }
}
