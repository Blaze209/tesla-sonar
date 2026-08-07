package com.google.firebase.remoteconfig.internal;

import com.withpersona.sdk2.inquiry.network.dto.InquiryField;

/* JADX INFO: loaded from: classes5.dex */
public class w implements rw.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f44770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f44771b;

    w(String str, int i11) {
        this.f44770a = str;
        this.f44771b = i11;
    }

    private String b() {
        return asString().trim();
    }

    private void c() {
        if (this.f44770a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    @Override // rw.j
    public long a() {
        if (this.f44771b == 0) {
            return 0L;
        }
        String strB = b();
        try {
            return Long.valueOf(strB).longValue();
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strB, "long"), e11);
        }
    }

    @Override // rw.j
    public boolean asBoolean() {
        if (this.f44771b == 0) {
            return false;
        }
        String strB = b();
        if (o.f44706f.matcher(strB).matches()) {
            return true;
        }
        if (o.f44707g.matcher(strB).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strB, InquiryField.BooleanField.TYPE));
    }

    @Override // rw.j
    public double asDouble() {
        if (this.f44771b == 0) {
            return 0.0d;
        }
        String strB = b();
        try {
            return Double.valueOf(strB).doubleValue();
        } catch (NumberFormatException e11) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", strB, "double"), e11);
        }
    }

    @Override // rw.j
    public String asString() {
        if (this.f44771b == 0) {
            return "";
        }
        c();
        return this.f44770a;
    }

    @Override // rw.j
    public int getSource() {
        return this.f44771b;
    }
}
