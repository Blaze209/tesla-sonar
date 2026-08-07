package com.teslamotors.plugins.ble;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes8.dex */
public class TeslaCardEmulationService extends HostApduService {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte[] f56680g = {111, 0};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f56681h = {110, 0};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final byte[] f56682i = {109, 0};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final byte[] f56683j = {-112, 0};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f56684k = {109, 0};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f56685l = {107, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Messenger f56687b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f56689d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.tesla.logging.g f56686a = com.tesla.logging.g.h("TeslaCardEmulationService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Messenger f56688c = new Messenger(new c());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConcurrentLinkedQueue<d> f56690e = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ServiceConnection f56691f = new a();

    class a implements ServiceConnection {
        a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            TeslaCardEmulationService.this.f56686a.j("onServiceConnected");
            TeslaCardEmulationService.this.f56687b = new Messenger(iBinder);
            TeslaCardEmulationService.this.f56689d = true;
            TeslaCardEmulationService.this.h();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (TeslaCardEmulationService.this.f56689d) {
                TeslaCardEmulationService.this.f56689d = false;
                TeslaCardEmulationService.this.f56686a.j("onServiceDisconnected");
            }
            TeslaCardEmulationService.this.f56687b = null;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f56693a;

        static {
            int[] iArr = new int[hf0.f.values().length];
            f56693a = iArr;
            try {
                iArr[hf0.f.NFCGetPublicKeyBytesInfo.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56693a[hf0.f.NFCEncryptWithSharedSecretResponse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56693a[hf0.f.RegisterComplete.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    class c extends Handler {
        c() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            data.setClassLoader(getClass().getClassLoader());
            int i11 = b.f56693a[hf0.f.get(message.what).ordinal()];
            if (i11 == 1) {
                Parcelable parcelable = data.getParcelable(hf0.f.NFCGetPublicKeyBytesInfo.getKey());
                if (parcelable != null) {
                    TeslaCardEmulationService.this.f((hf0.i) parcelable);
                    return;
                }
                TeslaCardEmulationService.this.f56686a.j("Pub key not ready yet, resend the request");
                Message messageObtain = Message.obtain();
                messageObtain.what = hf0.f.NFCGetPublicKeyBytes.getWhat();
                sendMessage(messageObtain);
                return;
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                TeslaCardEmulationService.this.f56686a.j("Successfully registered to received callbacks from BLE service");
            } else {
                Parcelable parcelable2 = data.getParcelable(hf0.f.NFCEncryptWithSharedSecretResponse.getKey());
                if (parcelable2 != null) {
                    TeslaCardEmulationService.this.e((hf0.d) parcelable2);
                } else {
                    TeslaCardEmulationService.this.f56686a.j("NFC auth response not ready yet");
                }
            }
        }
    }

    private static final class d extends in0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f56695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bundle f56696b;

        private /* synthetic */ boolean a(Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Objects.equals(this.f56695a, dVar.f56695a) && Objects.equals(this.f56696b, dVar.f56696b);
        }

        private /* synthetic */ Object[] b() {
            return new Object[]{this.f56695a, this.f56696b};
        }

        public final boolean equals(Object obj) {
            return a(obj);
        }

        public final int hashCode() {
            return e1.a(this.f56695a, this.f56696b);
        }

        public final String toString() {
            return d1.a(b(), d.class, "a;b");
        }

        private d(byte[] bArr, Bundle bundle) {
            this.f56695a = bArr;
            this.f56696b = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(hf0.d dVar) {
        byte[] bArrA = dVar.a();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (bArrA != null) {
                byteArrayOutputStream.write(Arrays.copyOfRange(bArrA, 0, 16));
                byteArrayOutputStream.write(f56683j);
            } else {
                byteArrayOutputStream.write(j((short) 28442));
            }
        } catch (IOException e11) {
            this.f56686a.c("Exception adding encrypted response to the message" + e11.getMessage());
        }
        sendResponseApdu(byteArrayOutputStream.toByteArray());
        this.f56686a.a("APDU Response (Get Auth response):" + ie0.q0.b(byteArrayOutputStream.toByteArray()));
        this.f56686a.a("APDU Response (Get Auth response):Length =" + byteArrayOutputStream.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(hf0.i iVar) {
        byte[] bArrA = iVar.a();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            if (bArrA != null) {
                byteArrayOutputStream.write(bArrA);
                byteArrayOutputStream.write(f56683j);
            } else {
                byteArrayOutputStream.write(j((short) 28435));
            }
        } catch (IOException e11) {
            this.f56686a.c("IOException adding public key to array" + e11.getMessage());
        }
        sendResponseApdu(byteArrayOutputStream.toByteArray());
        this.f56686a.a("APDU Response (Get Pub key):" + ie0.q0.b(byteArrayOutputStream.toByteArray()));
        this.f56686a.a("APDU Response (Get Pub key):Length =" + byteArrayOutputStream.size());
    }

    private byte[] g(byte[] bArr, Bundle bundle) {
        this.f56686a.a("Called Tesla Logic applet");
        byte[] bArrJ = f56683j;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte b11 = bArr[1];
        if (b11 == -92) {
            this.f56686a.j("Called to enable Tesla Logic applet");
        } else if (b11 != 4) {
            if (b11 != 17) {
                if (b11 == 20) {
                    try {
                        byteArrayOutputStream.write(j((short) 49));
                    } catch (IOException e11) {
                        this.f56686a.c("Exception when sending form factor" + e11.getMessage());
                    }
                } else if (b11 != 27) {
                    bArrJ = f56684k;
                } else {
                    this.f56686a.j("Got Vehicle Info");
                    byte b12 = bArr[4];
                    if (b12 < 30) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, b12 + 5);
                        this.f56686a.a("From Vehicle Protobuf : " + ie0.q0.b(bArrCopyOfRange));
                        Message messageObtain = Message.obtain();
                        hf0.f fVar = hf0.f.NFCProtoMessage;
                        messageObtain.what = fVar.getWhat();
                        Bundle bundle2 = new Bundle();
                        bundle2.putByteArray(fVar.getKey(), bArrCopyOfRange);
                        messageObtain.setData(bundle2);
                        if (!i(messageObtain)) {
                            bArrJ = j((short) 28442);
                        }
                    } else {
                        this.f56686a.j("Ignore Vehicle proto, too long info");
                    }
                }
            } else if (bArr[2] != 0) {
                bArrJ = f56685l;
            } else if (bArr[4] != 81) {
                bArrJ = j((short) 28441);
            } else {
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, 70);
                byte[] bArrCopyOfRange3 = Arrays.copyOfRange(bArr, 70, 86);
                this.f56686a.a("Requested Vehicle Public Key :" + ie0.q0.b(bArrCopyOfRange2));
                this.f56686a.a("Requested Vehicle Token :" + ie0.q0.b(bArrCopyOfRange3));
                Message messageObtain2 = Message.obtain();
                hf0.f fVar2 = hf0.f.NFCEncryptWithSharedSecret;
                messageObtain2.what = fVar2.getWhat();
                Bundle bundle3 = new Bundle();
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(ie0.q0.b(bArrCopyOfRange3));
                arrayList.add(ie0.q0.b(bArrCopyOfRange2));
                bundle3.putStringArrayList(fVar2.getKey(), arrayList);
                messageObtain2.setData(bundle3);
                if (i(messageObtain2)) {
                    return null;
                }
                bArrJ = j((short) 28442);
            }
        } else if (bArr[2] != 0) {
            bArrJ = f56685l;
        } else {
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = hf0.f.NFCGetPublicKeyBytes.getWhat();
            if (i(messageObtain3)) {
                return null;
            }
            bArrJ = j((short) 28435);
        }
        try {
            byteArrayOutputStream.write(bArrJ);
        } catch (IOException e12) {
            this.f56686a.c("Exception adding status code" + e12.getMessage());
        }
        this.f56686a.a("APDU Response :" + ie0.q0.b(byteArrayOutputStream.toByteArray()));
        this.f56686a.a("APDU Response :Length =" + byteArrayOutputStream.size());
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        int i11 = 0;
        while (true) {
            d dVarPoll = this.f56690e.poll();
            if (dVarPoll == null) {
                this.f56686a.j("Processed " + i11 + " pending APDU commands");
                return;
            }
            byte[] bArrG = g(dVarPoll.f56695a, dVarPoll.f56696b);
            if (bArrG != null) {
                sendResponseApdu(bArrG);
            }
            i11++;
        }
    }

    private boolean i(Message message) {
        Messenger messenger;
        this.f56686a.j("Sending message:" + hf0.f.getName(message.what));
        boolean z11 = false;
        if (!this.f56689d || (messenger = this.f56687b) == null) {
            this.f56686a.j("Failed to send message - service not bound");
            return false;
        }
        try {
            message.replyTo = this.f56688c;
            messenger.send(message);
            z11 = true;
            this.f56686a.j("Sent to Server from client :" + this.f56687b.toString() + "Reply to " + this.f56688c.toString());
            return true;
        } catch (RemoteException e11) {
            this.f56686a.c("Failed to send message - Remote Exception! : " + e11.getMessage());
            return z11;
        }
    }

    private static byte[] j(short s11) {
        return new byte[]{(byte) (s11 >> 8), (byte) (s11 & 255)};
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f56686a.j("onCreate called");
        bindService(new Intent(this, (Class<?>) BLEService.class), this.f56691f, 1);
    }

    @Override // android.nfc.cardemulation.HostApduService
    public void onDeactivated(int i11) {
        this.f56686a.j("Deactivated: " + i11);
    }

    @Override // android.app.Service
    public void onDestroy() {
        if (this.f56689d) {
            this.f56689d = false;
        }
        this.f56687b = null;
        this.f56690e.clear();
        unbindService(this.f56691f);
        this.f56686a.j("onDestroy called");
    }

    @Override // android.nfc.cardemulation.HostApduService
    public byte[] processCommandApdu(byte[] bArr, Bundle bundle) {
        if (this.f56689d && this.f56687b != null) {
            return g(bArr, bundle);
        }
        this.f56686a.j("Service not bound, caching APDU command");
        this.f56690e.offer(new d(bArr, bundle));
        return null;
    }
}
