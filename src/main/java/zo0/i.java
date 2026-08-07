package zo0;

import android.nfc.tech.IsoDep;
import java.io.IOException;
import net.sf.scuba.smartcards.CardServiceException;

/* JADX INFO: loaded from: classes9.dex */
public class i extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IsoDep f128477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f128478f = 0;

    public i(IsoDep isoDep) {
        this.f128477e = isoDep;
    }

    private boolean h(Throwable th2) {
        if (!i()) {
            return true;
        }
        if (th2 == null) {
            return false;
        }
        if (th2.getClass().getName().contains("TagLostException")) {
            return true;
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        if (message.toLowerCase().contains("tag was lost")) {
            return true;
        }
        return (th2 instanceof CardServiceException) && (message.toLowerCase().contains("not connected") || message.toLowerCase().contains("failed response"));
    }

    private boolean i() {
        try {
            return this.f128477e.isConnected();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // zo0.e
    public boolean c(Exception exc) {
        Throwable th2;
        if (h(exc)) {
            return true;
        }
        if (exc == null) {
            th2 = exc;
            return false;
        }
        while (true) {
            th2 = exc;
            Throwable cause = th2.getCause();
            if (cause == null || th2 == cause) {
                break;
            }
            if (h(cause)) {
                return true;
            }
            th2 = cause;
        }
        return false;
    }

    @Override // zo0.e
    public void e() throws CardServiceException {
        if (j()) {
            return;
        }
        try {
            this.f128477e.connect();
            if (!this.f128477e.isConnected()) {
                throw new CardServiceException("Failed to connect");
            }
            this.f128472b = 1;
        } catch (IOException e11) {
            throw new CardServiceException("Failed to connect", e11);
        }
    }

    @Override // zo0.e
    public j f(f fVar) throws CardServiceException {
        try {
            try {
                if (!this.f128477e.isConnected()) {
                    throw new CardServiceException("Not connected");
                }
                byte[] bArrTransceive = this.f128477e.transceive(fVar.c());
                if (bArrTransceive == null || bArrTransceive.length < 2) {
                    throw new CardServiceException("Failed response");
                }
                j jVar = new j(bArrTransceive);
                int i11 = this.f128478f + 1;
                this.f128478f = i11;
                d(new a(this, "ISODep", i11, fVar, jVar));
                return jVar;
            } catch (CardServiceException e11) {
                e = e11;
            } catch (Exception e12) {
                e = e12;
                throw new CardServiceException("Could not tranceive APDU", e);
            }
        } catch (CardServiceException e13) {
            e = e13;
        } catch (Exception e14) {
            e = e14;
        }
        throw e;
    }

    public void g() {
        try {
            this.f128477e.close();
            this.f128472b = 0;
        } catch (IOException unused) {
        }
    }

    public boolean j() {
        if (this.f128477e.isConnected()) {
            this.f128472b = 1;
            return true;
        }
        this.f128472b = 0;
        return false;
    }
}
