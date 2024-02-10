package org.example;

import java.util.List;

public class ProxyInternet implements Internet{

    private List<String> blockedSites;
    private Internet realInternet = new RealInternet();

    public List<String> getBlockedSites() {
        return blockedSites;
    }

    public void setBlockedSites(List<String> blockedSites) {
        this.blockedSites = blockedSites;
    }

    public ProxyInternet(List<String> blockedSites) {
        this.blockedSites = blockedSites;
    }

    @Override
    public void connectingTo(String site) {
        if(blockedSites.contains(site))
            System.out.println(site + " blocked!!!");
        else realInternet.connectingTo(site);
    }
}
