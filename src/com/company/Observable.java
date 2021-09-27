package com.company;

public interface Observable {
        void register(Observer user);
        void unregister( Observer user);
        void notifyuser();

}
