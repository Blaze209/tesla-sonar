package com.brentvatne.exoplayer;

import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.UUID;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/brentvatne/exoplayer/f;", "Lcom/brentvatne/exoplayer/g;", "Landroidx/media3/datasource/g;", "dataSourceFactory", "<init>", "(Landroidx/media3/datasource/g;)V", "Ljava/util/UUID;", "uuid", "Lvi/f;", "drmProps", "", "retryCount", "Landroidx/media3/exoplayer/drm/i;", "c", "(Ljava/util/UUID;Lvi/f;I)Landroidx/media3/exoplayer/drm/i;", "a", "(Ljava/util/UUID;Lvi/f;)Landroidx/media3/exoplayer/drm/i;", "Landroidx/media3/datasource/g;", "", "b", "Z", "hasDrmFailed", "react-native-video_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.media3.datasource.g dataSourceFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasDrmFailed;

    public f(androidx.media3.datasource.g dataSourceFactory) {
        p013kotlin.jvm.internal.s.k(dataSourceFactory, "dataSourceFactory");
        this.dataSourceFactory = dataSourceFactory;
    }

    private final androidx.media3.exoplayer.drm.i c(UUID uuid, vi.f drmProps, int retryCount) throws UnsupportedDrmException {
        if (s7.q0.f110454a < 18) {
            return null;
        }
        try {
            androidx.media3.exoplayer.drm.o oVar = new androidx.media3.exoplayer.drm.o(drmProps.getDrmLicenseServer(), this.dataSourceFactory);
            String[] drmLicenseHeader = drmProps.getDrmLicenseHeader();
            int i11 = 0;
            int iC = pn0.c.c(0, drmLicenseHeader.length - 1, 2);
            if (iC >= 0) {
                while (true) {
                    oVar.c(drmLicenseHeader[i11], drmLicenseHeader[i11 + 1]);
                    if (i11 == iC) {
                        break;
                    }
                    i11 += 2;
                }
            }
            final androidx.media3.exoplayer.drm.n nVarC = androidx.media3.exoplayer.drm.n.C(uuid);
            p013kotlin.jvm.internal.s.j(nVarC, "newInstance(...)");
            if (this.hasDrmFailed) {
                nVarC.D("securityLevel", "L3");
            }
            return new DefaultDrmSessionManager.b().g(uuid, new androidx.media3.exoplayer.drm.m.c() { // from class: com.brentvatne.exoplayer.e
                @Override // androidx.media3.exoplayer.drm.m.c
                public final androidx.media3.exoplayer.drm.m a(UUID uuid2) {
                    return f.d(nVarC, uuid2);
                }
            }).b(null).d(drmProps.getMultiDrm()).a(oVar);
        } catch (UnsupportedDrmException e11) {
            this.hasDrmFailed = true;
            throw e11;
        } catch (Exception e12) {
            if (retryCount >= 3) {
                throw new UnsupportedDrmException(1, e12);
            }
            this.hasDrmFailed = true;
            return c(uuid, drmProps, retryCount + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.media3.exoplayer.drm.m d(androidx.media3.exoplayer.drm.n nVar, UUID it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        return nVar;
    }

    @Override // com.brentvatne.exoplayer.g
    public androidx.media3.exoplayer.drm.i a(UUID uuid, vi.f drmProps) {
        p013kotlin.jvm.internal.s.k(uuid, "uuid");
        p013kotlin.jvm.internal.s.k(drmProps, "drmProps");
        return c(uuid, drmProps, 0);
    }
}
