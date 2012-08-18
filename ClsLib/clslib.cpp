#include <iostream>
#include "clslib.h"

using namespace std;

ClsLib *ClsLib::create() {
    return new ClsLib();
}

void ClsLib::destroy(ClsLib *clslib) {
    delete clslib;
}

ClsLib::~ClsLib() {

}

ClsLib::ClsLib() {
    mName = "clslib";
}

std::string ClsLib::getName() {
    return mName;
}

void ClsLib::hello_virtual() {
    cout << "hello from clslib." << endl;
}
