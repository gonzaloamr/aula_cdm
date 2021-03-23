package com.example.primeiroteste;

import android.os.Parcel;
import android.os.Parcelable;

public class Auth implements Parcelable {

    private String nome;
    private String pwd;

    public Auth(String nome, String pwd) {
        this.nome = nome;
        this.pwd = pwd;
    }
    private Auth(Parcel p){
        this.nome = p.readString();
        this.pwd = p.readString();

    }

    public static final Creator<Auth> CREATOR = new Creator<Auth>() {
        @Override
        public Auth createFromParcel(Parcel in) {
            return new Auth(in);
        }

        @Override
        public Auth[] newArray(int size) {
            return new Auth[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.nome);
        parcel.writeString(this.pwd);

    }

    public String getNome() {
        return nome;
    }

    public String getPwd() {
        return pwd;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
