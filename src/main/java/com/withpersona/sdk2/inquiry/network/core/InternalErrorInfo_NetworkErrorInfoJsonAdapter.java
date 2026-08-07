package com.withpersona.sdk2.inquiry.network.core;

import ch.qos.logback.core.CoreConstants;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import java.lang.reflect.Constructor;
import p013kotlin.collections.d1;

/* JADX INFO: loaded from: classes8.dex */
public final class InternalErrorInfo_NetworkErrorInfoJsonAdapter extends h<InternalErrorInfo.NetworkErrorInfo> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<InternalErrorInfo.NetworkErrorInfo> constructorRef;
    private final h<Integer> intAdapter;
    private final h<ErrorResponse.Error> nullableErrorAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options = k.b.a("code", "message", "isRecoverable", "responseError");

    public InternalErrorInfo_NetworkErrorInfoJsonAdapter(u uVar) {
        this.intAdapter = uVar.f(Integer.TYPE, d1.d(), "code");
        this.nullableStringAdapter = uVar.f(String.class, d1.d(), "message");
        this.booleanAdapter = uVar.f(Boolean.TYPE, d1.d(), "isRecoverable");
        this.nullableErrorAdapter = uVar.f(ErrorResponse.Error.class, d1.d(), "responseError");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("InternalErrorInfo.NetworkErrorInfo");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public InternalErrorInfo.NetworkErrorInfo fromJson(k kVar) throws NoSuchMethodException {
        kVar.h();
        Integer numFromJson = null;
        String strFromJson = null;
        Boolean boolFromJson = null;
        ErrorResponse.Error errorFromJson = null;
        int i11 = -1;
        while (kVar.hasNext()) {
            int iT = kVar.T(this.options);
            if (iT == -1) {
                kVar.e0();
                kVar.F();
            } else if (iT == 0) {
                numFromJson = this.intAdapter.fromJson(kVar);
                if (numFromJson == null) {
                    throw v20.c.x("code", "code", kVar);
                }
            } else if (iT == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(kVar);
            } else if (iT == 2) {
                boolFromJson = this.booleanAdapter.fromJson(kVar);
                if (boolFromJson == null) {
                    throw v20.c.x("isRecoverable", "isRecoverable", kVar);
                }
            } else if (iT == 3) {
                errorFromJson = this.nullableErrorAdapter.fromJson(kVar);
                i11 = -9;
            }
        }
        kVar.j();
        if (i11 == -9) {
            if (numFromJson == null) {
                throw v20.c.o("code", "code", kVar);
            }
            int iIntValue = numFromJson.intValue();
            if (boolFromJson != null) {
                return new InternalErrorInfo.NetworkErrorInfo(iIntValue, strFromJson, boolFromJson.booleanValue(), errorFromJson);
            }
            throw v20.c.o("isRecoverable", "isRecoverable", kVar);
        }
        Constructor<InternalErrorInfo.NetworkErrorInfo> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = v20.c.f117643c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = InternalErrorInfo.NetworkErrorInfo.class.getDeclaredConstructor(cls2, String.class, Boolean.TYPE, ErrorResponse.Error.class, cls2, cls);
            this.constructorRef = declaredConstructor;
        }
        if (numFromJson == null) {
            throw v20.c.o("code", "code", kVar);
        }
        if (boolFromJson != null) {
            return declaredConstructor.newInstance(numFromJson, strFromJson, boolFromJson, errorFromJson, Integer.valueOf(i11), null);
        }
        throw v20.c.o("isRecoverable", "isRecoverable", kVar);
    }

    @Override // com.squareup.moshi.h
    public void toJson(r rVar, InternalErrorInfo.NetworkErrorInfo networkErrorInfo) {
        if (networkErrorInfo == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        rVar.o();
        rVar.b0("code");
        this.intAdapter.toJson(rVar, Integer.valueOf(networkErrorInfo.getCode()));
        rVar.b0("message");
        this.nullableStringAdapter.toJson(rVar, networkErrorInfo.getMessage());
        rVar.b0("isRecoverable");
        this.booleanAdapter.toJson(rVar, Boolean.valueOf(networkErrorInfo.isRecoverable()));
        rVar.b0("responseError");
        this.nullableErrorAdapter.toJson(rVar, networkErrorInfo.getResponseError());
        rVar.C();
    }
}
