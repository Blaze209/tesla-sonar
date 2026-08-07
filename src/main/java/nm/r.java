package nm;

import com.facebook.common.memory.PooledByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    class a implements d0<PooledByteBuffer> {
        a() {
        }

        @Override // nm.d0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(PooledByteBuffer pooledByteBuffer) {
            return pooledByteBuffer.size();
        }
    }

    public static n<jk.d, PooledByteBuffer> a(pk.n<y> nVar, sk.d dVar, x.a aVar) {
        w wVar = new w(new a(), aVar, nVar, null, false, false);
        dVar.a(wVar);
        return wVar;
    }
}
