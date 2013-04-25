/* contacts.js */

var s5b = s5b || {};

s5b.contacts = {
    id1: {
        id: 1,
        telecoms: [ { type: 'standard', number: '(03) 9338 8508' } ],
        primaryLabel: 'Airport West',
        address: {
            description: 'Tenancy MM1, Westfield Airport West',
            number: '29-35', street: 'Louis St',
            suburb: 'Airport West', state: 'VIC', postcode: '3042'
        },
        openingHours: [
            { days: 'Mon-Wed', hours: '9am - 5.30pm, ' },
            { days: 'Thur-Fri', hours: '9am - 9pm' },
            { days: 'Sat', hours: '9am - 5pm' },
            { days: 'Sun', hours: '10am - 5pm' }
        ],
        web: []
    },
    id2: {
        id: 2,
        telecoms: [ { type: 'standard', number: '(03) 9596 7500' } ],
        primaryLabel: 'Brighton',
        address: {
            description: '', number: '459-467', street: 'Nepean Hwy',
            suburb: 'Brighton', state: 'VIC', postcode: '3186',
            geolocation: { lat: '999999', lon: '888888'}
        },
        openingHours: [
            { days: 'Mon-Fri', hours: '9am - 9pm' },
            { days: 'Sat', hours: '9am - 5pm' },
            { days: 'Sun', hours: '10am - 5pm' }
        ],
        web: []
    },
    id20: {
        id: 20,
        telecoms: [ { type: 'standard', number: '(03) 9596 7555' } ],
        primaryLabel: 'Brighton',
        address: {
            description: '', number: '17', street: 'Dendy St',
            suburb: 'Brighton', state: 'VIC', postcode: '3186',
            geolocation: { lat: '999999', lon: '888888'}
        },
        openingHours: [
            { days: 'Mon-Fri', hours: '9am - 9pm' },
            { days: 'Sat', hours: '9am - 5pm' },
            { days: 'Sun', hours: '10am - 5pm' }
        ],
        web: []
    },
    id4: {
        id: 4,
        telecoms: [ { type: 'standard', number: '(03) 9882 1372' } ],
        primaryLabel: 'Camberwell',
        secondaryLabel: 'Tenancy UR02, The Well',
        address: {
            description: 'Lvl 2', number: '793', street: 'Burke Rd',
            suburb: 'Camberwell', state: 'VIC', postcode: '3124',
            geolocation: { lat: '999999', lon: '888888'}
        },
        openingHours: [
            { days: 'Mon-Wed', hours: '9am - 6pm' },
            { days: 'Thur-Fri', hours: '9am - 9pm' },
            { days: 'Sat', hours: '9am - 5pm' },
            { days: 'Sun', hours: '10am -5pm' }
        ],
        web: []
    },
    id5: {
        id: 5,
        telecoms: [ { type: 'standard', number: '(03) 9569 9303' } ],
        primaryLabel: 'Chadstone',
        secondaryLabel: 'Chadstone Shopng Cntr',
        address: {
            description: 'Tenancy M001 Lower Lvl', number: '1341', street: 'Dandenong Rd',
            suburb: 'Chadstone', state: 'VIC', postcode: '3148',
            geolocation: { lat: '999999', lon: '888888'}
        },
        openingHours: [
            { days: 'Mon-Sat', hours: '9am - 9pm' },
            { days: 'Sun', hours: '10am - 6pm' }
        ],
        web: []
    },
    id3: {
        id: 3,
        telecoms: [ { type: 'standard', number: '(03) 9302 3555' } ],
        primaryLabel: 'Broadmeadows',
        secondaryLabel: 'Broadmeadows Town Cntr',
        address: {
            description: 'Shp G', number: '152', street: 'Coleraine St',
            suburb: 'Broadmeadows', state: 'VIC', postcode: '3047',
            geolocation: { lat: '999999', lon: '888888'}
        },
        openingHours: [
            { days: 'Mon-Wed', hours: '9am - 5.30pm' },
            { days: 'Thur-Fri', hours: '9am - 9pm' },
            { days: 'Sat', hours: '9am - 5pm' },
            { days: 'Sun', hours: '10am -5pm' }
        ],
        web: []
    },
    id6: {
        id: 6,
        telecoms: [ { type: 'standard', number: '(03) 9568 2811' } ],
        primaryLabel: 'Chadstone',
        address: {
            description: 'Tenancy 11/699 Lifestyle Centre', number: '675', street: 'Warrigal Rd',
            suburb: 'Chadstone', state: 'VIC', postcode: '3148',
            geolocation: { lat: '999999', lon: '888888'}
        },
        openingHours: [
            { days: 'Mon-Thur', hours: '9am - 5:30pm' },
            { days: 'Fri', hours: '9am - 9pm' },
            { days: 'Sat', hours: '9am - 5pm' },
            { days: 'Sun', hours: '10am - 5pm' }
        ],
        web: []
    },
    id7: {
        id: 7,
        telecoms: [ { type: 'standard', number: '(03) 9727 0211' } ],
        primaryLabel: 'Chirnside Park',
        address: {
            description: '', number: '272-282', street: 'Maroondah Hwy',
            suburb: 'Chirnside Park', state: 'VIC', postcode: '3116'
        },
        openingHours: [
            { days: 'Mon-Wed', hours: '9am-5.30pm'},
            { days: 'Thur-Fri', hours: '9am-9pm' },
            { days: 'Sat', hours: '9am-5pm' },
            { days: 'Sun', hours: '10am-5pm' }
        ],
        web: []
    },
    id8: {
        id: 8,
        telecoms: [ { type: 'standard', number: '(03) 5996 9555' } ],
        primaryLabel: 'Cranbourne',
        address: {
            number: 'Cnr', street: 'Thompson Rd and South Gippsland Hwy',
            suburb: 'Cranbourne', state: 'VIC', postcode: '3977'
        },
        openingHours: [
            { days: 'Mon-Wed', hours: '10am - 6pm' },
            { days: 'Thur-Fri', hours: '10am - 9pm' },
            { days: 'Sat', hours: '9am - 5pm' },
            { days: 'Sun', hours: '10am - 5pm' }
        ],
        web: []
    },
    id9: {
        id: 9,
        telecoms: [ { type: 'standard', number: '(03) 9793 6977' } ],
        primaryLabel: 'Dandenong',
        address: {
            description: '', number: '21-23', street: 'Cleeland St',
            suburb: 'Dandenong', state: 'VIC', postcode: '3175',
            geolocation: { lat: '999999', lon: '888888'}
        },
        openingHours: [
            { days: 'Mon-Wed', hours: '10am - 6pm' },
            { days: 'Thur-Fri', hours: '10am - 9pm' },
            { days: 'Sat', hours: '9am - 5pm' },
            { days: 'Sun', hours: '10am - 5pm' }
        ],
        web: []
    },
    id10: {
        id: 10,
        telecoms: [ { type: 'standard', number: '(03) 9840 7800' } ],
        primaryLabel: 'Doncaster',
        secondaryLabel: 'Westfield Shoppingtown Doncaster',
        address: {
            number: '', street: 'Doncaster Rd',
            suburb: 'Doncaster', state: 'VIC', postcode: '3108'
        },
        openingHours: [
            { days: 'Mon-Wed', hours: '9am - 5.30pm' },
            { days: 'Thur-Fri', hours: '9am - 9pm' },
            { days: 'Sat', hours: '9am - 6pm' },
            { days: 'Sun', hours: '10am - 5pm' }
        ],
        web: []
    },
    id11: {
        id: 11,
        telecoms: [ { type: 'standard', number: '(03) 9408 5055' } ],
        primaryLabel: 'Epping',
        secondaryLabel: 'Epping Plaza Shopng Cntr',
        address: {
            description: 'T 242', number: '571', street: '-583 High St',
            suburb: 'Epping', state: 'VIC', postcode: '3076',
            geolocation: { lat: '999999', lon: '888888'}
        },
        openingHours: [
            { days: 'Mon-Wed', hours: '9am - 5.30pm' },
            { days: 'Thur-Fri', hours: '9am - 9pm' },
            { days: 'Sat', hours: '9am - 5pm' },
            { days: 'Sun', hours: '10am - 5pm' }
        ],
        web: []
    },
    id12: {
        id: 12,
        telecoms: [ { type: 'standard', number: '(03) 9374 1911' } ],
        primaryLabel: 'Essendon DFO',
        address: {
            description: '', number: '100', street: 'Bulla Rd',
            suburb: 'Essendon Airport', state: 'VIC', postcode: '3041',
            geolocation: { lat: '999999', lon: '888888'}
        },
        openingHours: [
            { days: 'Mon-Wed', hours: '10am - 6pm' },
            { days: 'Thur-Fri', hours: '10am - 9pm' },
            { days: 'Sat', hours: '9am - 6pm' },
            { days: 'Sun', hours: '10am - 6pm' }
        ],
        web: []
    }
};
