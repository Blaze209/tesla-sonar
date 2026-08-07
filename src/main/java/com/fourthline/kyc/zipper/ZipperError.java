package com.fourthline.kyc.zipper;

import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@e
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/fourthline/kyc/zipper/ZipperError;", "", "<init>", "()V", "KycNotValid", "CannotCreateZip", "NotEnoughSpace", "ZipExceedMaximumSize", "Lcom/fourthline/kyc/zipper/ZipperError$CannotCreateZip;", "Lcom/fourthline/kyc/zipper/ZipperError$KycNotValid;", "Lcom/fourthline/kyc/zipper/ZipperError$NotEnoughSpace;", "Lcom/fourthline/kyc/zipper/ZipperError$ZipExceedMaximumSize;", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ZipperError extends Throwable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/kyc/zipper/ZipperError$CannotCreateZip;", "Lcom/fourthline/kyc/zipper/ZipperError;", "<init>", "()V", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CannotCreateZip extends ZipperError {
        public static final CannotCreateZip INSTANCE = new CannotCreateZip();

        private CannotCreateZip() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/kyc/zipper/ZipperError$KycNotValid;", "Lcom/fourthline/kyc/zipper/ZipperError;", "<init>", "()V", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class KycNotValid extends ZipperError {
        public static final KycNotValid INSTANCE = new KycNotValid();

        private KycNotValid() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/kyc/zipper/ZipperError$NotEnoughSpace;", "Lcom/fourthline/kyc/zipper/ZipperError;", "<init>", "()V", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NotEnoughSpace extends ZipperError {
        public static final NotEnoughSpace INSTANCE = new NotEnoughSpace();

        private NotEnoughSpace() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/fourthline/kyc/zipper/ZipperError$ZipExceedMaximumSize;", "Lcom/fourthline/kyc/zipper/ZipperError;", "<init>", "()V", "fourthline-kyc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ZipExceedMaximumSize extends ZipperError {
        public static final ZipExceedMaximumSize INSTANCE = new ZipExceedMaximumSize();

        private ZipExceedMaximumSize() {
            super(null);
        }
    }

    public /* synthetic */ ZipperError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ZipperError() {
    }
}
