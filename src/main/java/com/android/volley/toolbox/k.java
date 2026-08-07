package com.android.volley.toolbox;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k<T> extends com.android.volley.i<T> {
    protected static final String PROTOCOL_CHARSET = "utf-8";
    private static final String PROTOCOL_CONTENT_TYPE = String.format("application/json; charset=%s", PROTOCOL_CHARSET);
    private com.android.volley.k.b<T> mListener;
    private final Object mLock;
    private final String mRequestBody;

    @Deprecated
    public k(String str, String str2, com.android.volley.k.b<T> bVar, com.android.volley.k.a aVar) {
        this(-1, str, str2, bVar, aVar);
    }

    @Override // com.android.volley.i
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    @Override // com.android.volley.i
    protected void deliverResponse(T t11) {
        com.android.volley.k.b<T> bVar;
        synchronized (this.mLock) {
            bVar = this.mListener;
        }
        if (bVar != null) {
            bVar.onResponse(t11);
        }
    }

    @Override // com.android.volley.i
    public byte[] getBody() {
        try {
            String str = this.mRequestBody;
            if (str == null) {
                return null;
            }
            return str.getBytes(PROTOCOL_CHARSET);
        } catch (UnsupportedEncodingException unused) {
            com.android.volley.n.f("Unsupported Encoding while trying to get the bytes of %s using %s", this.mRequestBody, PROTOCOL_CHARSET);
            return null;
        }
    }

    @Override // com.android.volley.i
    public String getBodyContentType() {
        return PROTOCOL_CONTENT_TYPE;
    }

    @Override // com.android.volley.i
    @Deprecated
    public byte[] getPostBody() {
        return getBody();
    }

    @Override // com.android.volley.i
    @Deprecated
    public String getPostBodyContentType() {
        return getBodyContentType();
    }

    @Override // com.android.volley.i
    protected abstract com.android.volley.k<T> parseNetworkResponse(com.android.volley.h hVar);

    public k(int i11, String str, String str2, com.android.volley.k.b<T> bVar, com.android.volley.k.a aVar) {
        super(i11, str, aVar);
        this.mLock = new Object();
        this.mListener = bVar;
        this.mRequestBody = str2;
    }
}
