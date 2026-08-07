package net.time4j.tz;

import com.plaid.internal.EnumC4419g;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes9.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = -1000776907354520172L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Object f94747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f94748b;

    public SPX() {
    }

    private Object a(ObjectInput objectInput, byte b11) {
        return new a((k) objectInput.readObject(), (l) objectInput.readObject());
    }

    private Object b(ObjectInput objectInput, byte b11) {
        return p.q(objectInput.readInt(), (b11 & 15) == 1 ? objectInput.readInt() : 0);
    }

    private Object c(byte b11) {
        int i11 = b11 & 15;
        return n.d(b.values()[i11 / 2], g.values()[i11 % 2]);
    }

    private Object d(ObjectInput objectInput, byte b11) {
        k kVar = (k) objectInput.readObject();
        m mVar = (m) objectInput.readObject();
        o oVar = l.f94761d;
        if ((b11 & 15) == 1) {
            oVar = (o) objectInput.readObject();
        }
        return new c(kVar, mVar, oVar);
    }

    private void e(ObjectOutput objectOutput) throws IOException {
        a aVar = (a) this.f94747a;
        objectOutput.writeByte(192);
        objectOutput.writeObject(aVar.z());
        objectOutput.writeObject(aVar.R());
    }

    private void f(ObjectOutput objectOutput) throws IOException {
        p pVar = (p) this.f94747a;
        boolean z11 = pVar.i() != 0;
        objectOutput.writeByte(z11 ? EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE : EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
        objectOutput.writeInt(pVar.j());
        if (z11) {
            objectOutput.writeInt(pVar.i());
        }
    }

    private void g(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(((n) this.f94747a).c() | EnumC4419g.SDK_ASSET_ICON_INCOME_VALUE);
    }

    private void h(ObjectOutput objectOutput) throws IOException {
        c cVar = (c) this.f94747a;
        boolean z11 = cVar.E() != l.f94761d;
        objectOutput.writeByte(z11 ? EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_SEARCH_CIRCLE_VALUE : 224);
        objectOutput.writeObject(cVar.z());
        objectOutput.writeObject(cVar.y());
        if (z11) {
            objectOutput.writeObject(cVar.E());
        }
    }

    private Object readResolve() {
        return this.f94747a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte b11 = objectInput.readByte();
        switch ((b11 & 255) >> 4) {
            case 12:
                this.f94747a = a(objectInput, b11);
                return;
            case 13:
                this.f94747a = c(b11);
                return;
            case 14:
                this.f94747a = d(objectInput, b11);
                return;
            case 15:
                this.f94747a = b(objectInput, b11);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        switch (this.f94748b) {
            case 12:
                e(objectOutput);
                return;
            case 13:
                g(objectOutput);
                return;
            case 14:
                h(objectOutput);
                return;
            case 15:
                f(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    SPX(Object obj, int i11) {
        this.f94747a = obj;
        this.f94748b = i11;
    }
}
