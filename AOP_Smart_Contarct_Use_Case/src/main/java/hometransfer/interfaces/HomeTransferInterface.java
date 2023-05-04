package hometransfer.interfaces;

import hometransfer.models.Home;


import org.hyperledger.fabric.contract.Context;

public interface HomeTransferInterface {

    public void initLedger(final Context ctx);
    public Home addNewHome(final Context ctx, final String id, final String name, final String area,
                           final String ownername, final String value);
    public Home queryHome(final Context ctx, final String id);
    public Home changeHomeOwnership(final Context ctx, final String id, final String newHomeOwner);
}