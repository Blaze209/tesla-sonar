package com.alipay.android.phone.mrpc.core;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* JADX INFO: loaded from: classes3.dex */
public class j extends a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f19999g;

    public j(g gVar, Method method, int i11, String str, byte[] bArr, boolean z11) {
        super(method, i11, str, bArr, "application/x-www-form-urlencoded", z11);
        this.f19999g = gVar;
    }

    private int a(int i11) {
        switch (i11) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 15;
            case 9:
                return 16;
            default:
                return i11;
        }
    }

    private ad b() {
        return this.f19999g.b();
    }

    @Override // com.alipay.android.phone.mrpc.core.w
    public Object a() {
        o oVar = new o(this.f19999g.a());
        oVar.a(this.f19963b);
        oVar.a(this.f19966e);
        oVar.a(this.f19967f);
        oVar.a("id", String.valueOf(this.f19965d));
        oVar.a("operationType", this.f19964c);
        oVar.a("gzip", String.valueOf(this.f19999g.d()));
        a(oVar);
        Log.i("HttpCaller", "threadid = " + Thread.currentThread().getId() + "; " + oVar.toString());
        try {
            v vVar = b().a(oVar).get();
            if (vVar != null) {
                return vVar.b();
            }
            throw new RpcException((Integer) 9, "response is null");
        } catch (InterruptedException e11) {
            throw new RpcException(13, "", e11);
        } catch (CancellationException e12) {
            throw new RpcException(13, "", e12);
        } catch (ExecutionException e13) {
            Throwable cause = e13.getCause();
            if (cause == null || !(cause instanceof HttpException)) {
                throw new RpcException(9, "", e13);
            }
            HttpException httpException = (HttpException) cause;
            throw new RpcException(Integer.valueOf(a(httpException.getCode())), httpException.getMsg());
        }
    }

    private void a(o oVar) {
        oVar.a(new BasicHeader("uuid", UUID.randomUUID().toString()));
        List<Header> listB = this.f19999g.c().b();
        if (listB == null || listB.isEmpty()) {
            return;
        }
        Iterator<Header> it = listB.iterator();
        while (it.hasNext()) {
            oVar.a(it.next());
        }
    }
}
