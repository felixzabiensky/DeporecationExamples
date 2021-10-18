interface UserInfo{
    name: string;
    /** @deprecated use location field instead */
    address: string;
    location: string;
}

declare const userInfo: UserInfo;
userInfo.address;